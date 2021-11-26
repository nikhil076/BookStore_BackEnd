package com.javainuse.springbootsecurity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javainuse.springbootsecurity.model.DAOBook;
import com.javainuse.springbootsecurity.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
	public DAOBook getBookById(int id) {
		return bookRepository.findById(id).orElse(null);
	}
	
	public List<DAOBook> getAllBooks(){
		return bookRepository.findAll();
	}
	
	public String deleteBookById(int id) {
		bookRepository.deleteById(id);
		return "User with id " +id +" is Deleted";
	}
	
	public DAOBook addBook(DAOBook daoBook) {
		return bookRepository.save(daoBook);
	}
	
	public DAOBook changeBookQuantity(int id,int quantity) {
		DAOBook daoBook = this.getBookById(id);
		daoBook.setQuantity(quantity);
		bookRepository.save(daoBook);
		return daoBook;
	}
	
	public DAOBook updateBookPrice(int id,int price) {
		DAOBook daoBook = this.getBookById(id);
		daoBook.setPrice(price);
		bookRepository.save(daoBook);
		return daoBook;
	}
}

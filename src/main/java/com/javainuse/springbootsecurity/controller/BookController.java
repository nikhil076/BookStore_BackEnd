package com.javainuse.springbootsecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.springbootsecurity.model.DAOBook;
import com.javainuse.springbootsecurity.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;
	
	@PostMapping("/addbook")
	public ResponseEntity<?> addBook(@RequestBody DAOBook daoBook){
		return ResponseEntity.ok(bookService.addBook(daoBook));
	}
	
	@GetMapping("/book/{id}")
	public ResponseEntity<?> getBookById(@PathVariable int id){
		return ResponseEntity.ok(bookService.getBookById(id));
	}
	
	@GetMapping("/allbooks")
	public ResponseEntity<?> getAllBooks(){
		return ResponseEntity.ok(bookService.getAllBooks());
	}
	
	@PutMapping("/updatequantity/{id}/{quantity}")
	public ResponseEntity<?> updateBookQuantity(@PathVariable int id,@PathVariable int quantity){
		return ResponseEntity.ok(bookService.changeBookQuantity(id, quantity));
	}
	
	@PutMapping("/updateprice/{id}/{price}")
	public ResponseEntity<?> updateBookPrice(@PathVariable int id,@PathVariable int price){
		return ResponseEntity.ok(bookService.updateBookPrice(id, price));
	}
}

package com.javainuse.springbootsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javainuse.springbootsecurity.model.DAOBook;

@Repository
public interface BookRepository extends JpaRepository<DAOBook, Integer>{

}

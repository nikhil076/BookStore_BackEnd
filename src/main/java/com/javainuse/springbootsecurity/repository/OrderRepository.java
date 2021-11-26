package com.javainuse.springbootsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javainuse.springbootsecurity.model.DAOOrder;

@Repository
public interface OrderRepository extends JpaRepository<DAOOrder, Integer>{

}

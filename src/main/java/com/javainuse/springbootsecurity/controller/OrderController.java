package com.javainuse.springbootsecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.springbootsecurity.model.DAOOrder;
import com.javainuse.springbootsecurity.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@PostMapping("/addOrder")
	public ResponseEntity<?> addOrder(@RequestBody DAOOrder daoOrder){
		return ResponseEntity.ok(orderService.PlaceOrder(daoOrder));
	}
	
	@GetMapping("/allOrders")
	public ResponseEntity<?> getAllOrders(){
		return ResponseEntity.ok(orderService.getAllOrders());
	}
	
	@GetMapping("/order/{id}")
	public ResponseEntity<?> getOrderByID(@PathVariable int id){
		return ResponseEntity.ok(orderService.findOrderById(id));
	}
	
	@PutMapping("/cancelOrder/{id}")
	public ResponseEntity<?> cancelOrder(@PathVariable int id){
		return ResponseEntity.ok(orderService.cancelOrder(id));
	}
}

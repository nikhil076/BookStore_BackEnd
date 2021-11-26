package com.javainuse.springbootsecurity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javainuse.springbootsecurity.model.DAOOrder;
import com.javainuse.springbootsecurity.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	public DAOOrder PlaceOrder(DAOOrder daoOrder) {
		return orderRepository.save(daoOrder);
	}
	
	public DAOOrder findOrderById(int id) {
		return orderRepository.findById(id).orElse(null);
	}
	
	public DAOOrder cancelOrder(int id) {
		DAOOrder daoOrder = this.findOrderById(id);
		
		if(daoOrder.isCancel()==false)
		{
			daoOrder.setCancel(true);
			orderRepository.save(daoOrder);
			System.out.println("Order Has been Cancelled");
			return daoOrder;
		}else {
			System.out.println("No Order to be cancelled");
			return null;
		}
	}
	
	public List<DAOOrder> getAllOrders(){
		return orderRepository.findAll();
	}
}

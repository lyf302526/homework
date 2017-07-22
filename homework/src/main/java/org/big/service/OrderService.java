package org.big.service;

import java.util.List;

import org.big.domain.Order;

public interface OrderService {
	void addorder(Order order,String goods_id,Integer count,Integer sale);
	int deleteorder(Order order);
	List<Order> getAll();
	Order selectOrder(int id);
	void updateOrder(String state,int id);
	
}
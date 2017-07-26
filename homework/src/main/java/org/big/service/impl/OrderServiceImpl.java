package org.big.service.impl;

import java.util.List;

import org.big.domain.Order;
import org.big.mapper.OrderMapper;
import org.big.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("orderService")
public class OrderServiceImpl implements OrderService{
	@Autowired
	private OrderMapper orderMapper;
	private int count;
	@Transactional(readOnly=true)

	@Override
	public List<Order> getAll() {
		// TODO Auto-generated method stub
		return orderMapper.findAll();
	}

	@Override
	public Order selectOrder(int id) {
		// TODO Auto-generated method stub
		Order order=orderMapper.selectOrder(id);
		return order;
	}

	@Override
	public int deleteorder(Order order) {
		// TODO Auto-generated method stub
		return orderMapper.delete(order);
	}

	@Override
	public void addorder(Order order,String goods_id,Integer count,Integer sale) {
		// TODO Auto-generated method stub
		 orderMapper.add(order);
		 orderMapper.deleteCart(goods_id);
		 orderMapper.reduceGoods(goods_id, count,sale);
		
		
	}

	@Override
	public void updateOrder(String state, int id) {
		// TODO Auto-generated method stub
		orderMapper.updateOrder(state, id);
	}

	@Override
	public Order selectOrders(int id) {
		// TODO Auto-generated method stub
		Order order=orderMapper.selectOrders(id);
		return order;
	}

	
}

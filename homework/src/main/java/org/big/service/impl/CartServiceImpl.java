package org.big.service.impl;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.big.domain.Cart;
import org.big.mapper.CartMapper;
import org.big.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
@Service("cartService")
public class CartServiceImpl implements CartService{
	@Autowired
	private CartMapper cartMapper;
	@Transactional(readOnly=true)
	@Override
	public List<Cart> getCart() {
		// TODO Auto-generated method stub
		return cartMapper.findAll();
	}

	

	@Override
	public int deleteAll(Cart cart) {
		// TODO Auto-generated method stub
		return cartMapper.deleteAll(cart);
	}

	@Override
	public Cart findCart(String goods_id) {
		// TODO Auto-generated method stub
		 return cartMapper.findWithId(goods_id);
	}

	@Override
	public void addCart(String goods_id) {
		// TODO Auto-generated method stub
		cartMapper.addCart(goods_id);
	}

	@Override
	public void saveCart(Cart cart) {
		// TODO Auto-generated method stub
		int i = 1;
		cart.setCount(i);
		cartMapper.save(cart);
		
	}



	@Override
	public void deleteCart(Cart cart) {
		// TODO Auto-generated method stub
		cartMapper.delete(cart);
	}


}
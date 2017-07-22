package org.big.service;

import java.util.List;


import org.big.domain.Cart;

public interface CartService {
	List<Cart> getCart();
	void deleteCart(Cart cart);
	void addCart(String goods_id);
	int deleteAll(Cart cart);
	Cart findCart(String goods_id);
	void saveCart(Cart cart);
}

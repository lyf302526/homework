package org.big.service;

import java.util.List;

import org.big.domain.Goods;

/**
 * Goods服务层接口
 */
public interface GoodsService {
	/**
	 * 查找所有Goods
	 * @return Goods对象集合
	 */
	List<Goods> getAll();
	Goods selectGoods(String goods_id);
	int addGoods(Goods goods);
	int deleteGoods(String goods_id);
	//int addOrder(String goods_id);
}

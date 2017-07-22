package org.big.service.impl;

import java.util.List;

import org.big.domain.Goods;
import org.big.mapper.GoodsMapper;
import org.big.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Goods服务层接口实现类
 * @Service（"goodsService")用于将当前注释为一个Spring的bean,名为goodsService
 */
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("goodsService")
public class GoodsServiceImpl implements GoodsService{
	/**
	 * 自动注入GoodsMapper
	 */
	@Autowired
	private GoodsMapper goodsMapper;

	
	/**
	 * GoodsService接口getAll方法实现
	 */
	@Transactional(readOnly=true)
	@Override
	public List<Goods> getAll() {
		// TODO Auto-generated method stub
		return goodsMapper.findAll();
	}


	

	

	@Override
	public Goods selectGoods(String goods_id) {
		// TODO Auto-generated method stub
		return goodsMapper.selectGoods(goods_id);
	}




	@Override
	public int addGoods(Goods goods) {
		// TODO Auto-generated method stub
		return goodsMapper.add(goods);
	}






	@Override
	public int deleteGoods(String goods_id) {
		// TODO Auto-generated method stub
		return goodsMapper.delete(goods_id);
	}






	



}

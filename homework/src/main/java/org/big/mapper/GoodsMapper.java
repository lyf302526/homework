package org.big.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.big.domain.Goods;

/**
 * GoodsMapper接口
 */
public interface GoodsMapper {
	/**
	 * 查询所有物品
	 * @return 物品对象集合
	 */
	@Select("select * from tb_goods")
	List<Goods> findAll();
	@Select("select * from tb_goods where goods_id=#{goods_id}")
	  Goods selectGoods(@Param("goods_id")String  goods_id);
	@Delete("delete from tb_goods where goods_id=#{goods_id}")
	int delete(@Param("goods_id")String goods_id);
	@Insert("insert into tb_goods(goods_id,goods_name,discriber,price,count,"
			+ "image1,image2,image3,image4,image5) values(#{goods_id},#{goods_name},"
			+ "#{discriber},#{price},#{count},#{image1},#{image2},#{image3},#{image4},#{image5})")
	int add(Goods goods);
	
}

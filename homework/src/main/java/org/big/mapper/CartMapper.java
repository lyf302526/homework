package org.big.mapper;




import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.big.domain.Cart;

public interface CartMapper{
	@Select(" select * from cart ")
	List<Cart> findAll();
	@Delete("delete from cart where id=#{id}")
	int delete(Cart cart);
	@Insert("insert into cart(goods_id,image1,price,user_id,goods_name,count)values(#{goods_id},#{image1},#{price},#{user_id},#{goods_name},#{count})")
	int save(Cart cart);
	@Insert("insert into cart(goods_id,goods_name,image1,price,user_id)values(#{goods_id},#{goods_name},#{image1},#{price},#{user_id})")
	int add(Cart cart);
	@Delete("delete from cart")
	int deleteAll(Cart cart);
	@Select(" select * from cart where goods_id=#{goods_id}")
	Cart findWithId(@Param("goods_id") String goods_id);
	@Update("update cart set count=count+1 where goods_id=#{goods_id}")
	int addCart(@Param("goods_id") String goods_id);
}
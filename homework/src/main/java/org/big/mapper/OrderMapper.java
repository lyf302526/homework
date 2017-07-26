package org.big.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.big.domain.Order;

public interface OrderMapper {
	@Select(" select * from tb_order ")
	List<Order> findAll();
	@Delete("delete from tb_order where id=#{id}")
	int delete(Order order);
	@Select(" select * from tb_order where user_id=#{user.id}")
	List<Order> findSome();
	@Insert("insert into tb_order (goods_id,goods_name,user_id,state)values(#{goods_id},#{goods_name},#{user_id},#{state})")
	int add(Order order);
	@Select("select * from tb_order where id=#{id}")
	Order selectOrder(@Param("id") int id);
	@Select("select * from tb_order where id=#{id}")
	Order selectOrders(@Param("id") int id);
	@Update("update tb_order set state=#{state} where id=#{id}")
	int updateOrder(@Param("state") String state,@Param("id") int id);
	@Update("update tb_goods set count=count-#{count},sale=sale+#{count} where goods_id=#{goods_id}")
	int reduceGoods(@Param("goods_id") String goods_id,@Param("count") Integer count,@Param("sale") Integer sale);
	@Delete("delete from cart where goods_id=#{goods_id}")
	int deleteCart(@Param("goods_id") String goods_id);

}

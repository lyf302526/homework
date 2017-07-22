package org.big.domain;

import java.io.Serializable;

public class Cart  implements Serializable{
	private Integer id;
	private String image1;
	private Double price;
	private int count;
	private String goods_id;
	private String goods_name;
	private Integer user_id;
	public Cart(){
		super(); 
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setGoods_id(String goods_id) {
		this.goods_id = goods_id;
	}
	public String getGoods_id() {
		return goods_id;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count =count;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	@Override
	public String toString() {
		return "Cart [id="+id+",image1="+image1+",price="+price+",goods_id="+goods_id+",goods_name="
				+goods_name+",count="+count+",user_id="+user_id+"]";
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getImage1() {
		return image1;
	}
	public void setImage1(String image1) {
		this.image1 = image1;
	}
	public String getGoods_name() {
		return goods_name;
	}
	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}
}

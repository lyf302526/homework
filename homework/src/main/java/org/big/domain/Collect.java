package org.big.domain;

import java.io.Serializable;

public class Collect implements Serializable{
	private Integer id;
	private String goods_id;
	private String image1;
	private Double price;
	private Integer count;
	public Collect(){
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(String goods_id) {
		this.goods_id = goods_id;
	}
	public String getImage1() {
		return image1;
	}
	public void setImage1(String image1) {
		this.image1 = image1;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "Collect [id="+id+",image1="+image1+",price="+price+",goods_id="+goods_id+",count="+count+"]";
	}
}

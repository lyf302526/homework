package org.big.domain;

import java.io.Serializable;

public class Goods implements Serializable{
	private Integer id;            //id
	private String goods_name;     //物品名
	private String goods_id;
	private String discriber;      //描述
	private Double price;          //价格
	private String image1;          //图片
	private String image2;
	private String image3;
	private String image4;
	private String image5;
	private Integer count;
	private String sale;
	public Goods(){
		super();
		// TODO Auto-generated constructor stub
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
	public String getGoods_name(){
		return goods_name;
	}
	public void setGoods_name(String goods_name){
		this.goods_name=goods_name;
	}
	public String getDiscriber(){
		return discriber;
	}
	public void setDiscriber(String discriber){
		this.discriber=discriber;
	}
	public double getPrice(){
		return price;
	}
	public void setPrice(double price){
		this.price=price;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "Goods[id="+id+",goods_name="+goods_name+",discriber="+discriber
				+",price="+price+",image1="+image1+",image2="+image2+",image3="
				+image3+",image4="+image4+",image5="+image5+",count="+count+",sale="
				+sale+"]";
	}
	public String getImage1() {
		return image1;
	}
	public void setImage1(String image1) {
		this.image1 = image1;
	}
	public String getImage2() {
		return image2;
	}
	public void setImage2(String image2) {
		this.image2 = image2;
	}
	public String getImage3() {
		return image3;
	}
	public void setImage3(String image3) {
		this.image3 = image3;
	}
	public String getImage4() {
		return image4;
	}
	public void setImage4(String image4) {
		this.image4 = image4;
	}
	public String getImage5() {
		return image5;
	}
	public void setImage5(String image5) {
		this.image5 = image5;
	}
	public String getSale() {
		return sale;
	}
	public void setSale(String sale) {
		this.sale = sale;
	}
}

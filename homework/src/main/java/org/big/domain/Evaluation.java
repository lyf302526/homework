package org.big.domain;

import java.io.Serializable;

public class Evaluation implements Serializable{
	private int id;
	private String goods_id;
	private int user_id;
	private Float wuliu;
	private Float maijia;
	private Float zhiliang;
	private String text;
	private String image;
	public Evaluation(){
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGoods_id() {
		return goods_id;
	}
	public void setGoods_id(String goods_id) {
		this.goods_id = goods_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public Float getWuliu() {
		return wuliu;
	}
	public void setWuliu(Float wuliu) {
		this.wuliu = wuliu;
	}
	public Float getMaijia() {
		return maijia;
	}
	public void setMaijia(Float maijia) {
		this.maijia = maijia;
	}
	public Float getZhiliang() {
		return zhiliang;
	}
	public void setZhiliang(Float zhiliang) {
		this.zhiliang = zhiliang;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "Evaluation[id="+id+",goods_id="+goods_id+",user_id="+user_id+",wuliu="+wuliu+",maijia="
				+maijia+",zhiliang="+zhiliang+",text="+text+",image="+image+"]";
	}
}

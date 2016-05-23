package com.ddup.commercialization.api.model;

import java.io.Serializable;

public class GoodsDTO implements Serializable{
	
	/**  */
	private static final long serialVersionUID = 1L;

	/** 商品ID */
	private int id;
	
	/** 商品名称 */
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "GoodsDTO [id=" + id + ", name=" + name + "]";
	}
	
}

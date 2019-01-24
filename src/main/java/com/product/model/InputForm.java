package com.product.model;

import java.util.Calendar;
import java.util.Date;

public class InputForm {

	public String name;
	public Integer sellIn;
	public Integer quality;
	public Date addedDate;
	public Date sellByDate;

	public InputForm() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InputForm(String name, Integer sellIn, Integer quality) {
		super();
		this.name = name;
		this.sellIn = sellIn;
		this.quality = quality;
		this.addedDate=new Date();
		this.sellByDate = new Date();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSellIn() {
		return sellIn;
	}

	public void setSellIn(Integer sellIn) {
		this.sellIn = sellIn;
	}

	public Integer getQuality() {
		return quality;
	}

	public void setQuality(Integer quality) {
		this.quality = quality;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date entryDate) {
		this.addedDate = entryDate;
	}

	public Date getSellByDate() {
		return sellByDate;
	}

	public void setSellByDate(Date entryDate) {
		this.sellByDate = entryDate;
	}

}
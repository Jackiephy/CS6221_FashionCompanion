package org.fashion.main.domain;

import java.io.Serializable;

import javax.persistence.*;

@Entity @Table(name="CLOTHES")
public class Clothes implements Serializable{

	private static final long serialVersionUID = 4567617949982320608L;
	
	/** CLOTHES_ID LONG */
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="CLOTHES_ID")
	private Long clothesId;
	
	/** TYPE VARCHAR2(200) */
	@Column(name="TYPE",length=200)
	private String type;
	
	/** TAG LONG */
	@Column(name="TAG")
	private Long tag;
	
	/** PART SHORT */
	@Column(name="PART")
	private Short part;
	
	/** PRICE DOUBLE */
	@Column(name="PRICE")
	private Double price;
	
	/** PICTURE VARCHAR2(200) */
	@Column(name="PICTURE",length=200)
	private String picture;
	
	/** STYLE VARCHAR2(200) */
	@Column(name="STYLE",length=200)
	private String style;

	public Long getClothesId() {
		return clothesId;
	}

	public void setClothesId(Long clothesId) {
		this.clothesId = clothesId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getTag() {
		return tag;
	}

	public void setTag(Long tag) {
		this.tag = tag;
	}

	public Short getPart() {
		return part;
	}

	public void setPart(Short part) {
		this.part = part;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	@Override
	public String toString() {
		return "Clothes [clothesId=" + clothesId + ", type=" + type + ", tag=" + tag + ", part=" + part + ", price="
				+ price + ", picture=" + picture + ", style=" + style + "]";
	}

}

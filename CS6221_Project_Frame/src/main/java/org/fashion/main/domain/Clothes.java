package org.fashion.main.domain;

import java.io.Serializable;

import javax.persistence.*;

@Entity @Table(name="CLOTHES")
public class Clothes implements Serializable{
	

	/**
	 * 
	 */
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
	
	
	
	
	
	

}

package org.fashion.main.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity @Table(name="ORDER")
public class order implements Serializable {
	
	private static final long serialVersionUID = -1380308060635931613L;
	
	/** ORDER_ID Automatically_Increasing Primary_Key*/
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ORDER_ID")
	private Long orderId;
	
	/** ORDER_DATE	DATE*/
	@Column(name="DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;
	
	/** SUM	DOUBLE*/
	@Column(name="SUM")
	private Double name;
	
	/** EMAIL VARCHAR2(200) FK(UNAME)*/
	@ManyToOne(fetch=FetchType.LAZY, targetEntity=User.class)
	@JoinColumn(name="EMAIL", referencedColumnName="UNAME", 
				foreignKey=@ForeignKey(name="FK_ORDER_EMAIL"))
	private User email;
	
	/**ADDRESS VARCHAR2(200) FK(ADDRESS)*/
	@ManyToOne(fetch=FetchType.LAZY, targetEntity=User.class)
	@JoinColumn(name="ADDRESS", referencedColumnName="ADDRESS",
	            foreignKey=@ForeignKey(name="FK_ORDER_ADDRESS"))
	private User address;
	
	/**PHONE VARCHAR2(200) FK(PHONE)*/
	@ManyToOne(fetch=FetchType.LAZY, targetEntity=User.class)
	@JoinColumn(name="PHONE", referencedColumnName="PHONE",
	            foreignKey=@ForeignKey(name="FK_ORDER_PHONE"))
	private User phone;
	
	/**CONDITION SHORT*/
	@Column(name="CONDITION")
	private Short condition;
	
	/**CLOTHES_ID1 LONG FK(CLOTHES_ID)*/
	@ManyToMany(fetch=FetchType.LAZY, targetEntity=Clothes.class)
	@JoinColumn(name="CLOTHES_ID1", referencedColumnName="CLOTHES_ID",
	            foreignKey=@ForeignKey(name="FK_ORDER_CLOTHES_ID1"))
	private Clothes clothesId1;
	
	/**CLOTHES_ID2 LONG FK(CLOTHES_ID)*/
	@ManyToMany(fetch=FetchType.LAZY, targetEntity=Clothes.class)
	@JoinColumn(name="CLOTHES_ID2", referencedColumnName="CLOTHES_ID",
	            foreignKey=@ForeignKey(name="FK_ORDER_CLOTHES_ID2"))
	private Clothes clothesId2;
	
	/**CLOTHES_ID3 LONG FK(CLOTHES_ID)*/
	@ManyToMany(fetch=FetchType.LAZY, targetEntity=Clothes.class)
	@JoinColumn(name="CLOTHES_ID3", referencedColumnName="CLOTHES_ID",
	            foreignKey=@ForeignKey(name="FK_ORDER_CLOTHES_ID3"))
	private Clothes clothesId3;
	
	/**CLOTHES_ID4 LONG FK(CLOTHES_ID)*/
	@ManyToMany(fetch=FetchType.LAZY, targetEntity=Clothes.class)
	@JoinColumn(name="CLOTHES_ID4", referencedColumnName="CLOTHES_ID",
	            foreignKey=@ForeignKey(name="FK_ORDER_CLOTHES_ID4"))
	private Clothes clothesId4;
	
	/**CLOTHES_ID5 LONG FK(CLOTHES_ID)*/
	@ManyToMany(fetch=FetchType.LAZY, targetEntity=Clothes.class)
	@JoinColumn(name="CLOTHES_ID5", referencedColumnName="CLOTHES_ID",
	            foreignKey=@ForeignKey(name="FK_ORDER_CLOTHES_ID5"))
	private Clothes clothesId5;
	
	/**CLOTHES_ID6 LONG FK(CLOTHES_ID)*/
	@ManyToMany(fetch=FetchType.LAZY, targetEntity=Clothes.class)
	@JoinColumn(name="CLOTHES_ID6", referencedColumnName="CLOTHES_ID",
	            foreignKey=@ForeignKey(name="FK_ORDER_CLOTHES_ID6"))
	private Clothes clothesId6;
	
	/**CLOTHES_ID7 LONG FK(CLOTHES_ID)*/
	@ManyToMany(fetch=FetchType.LAZY, targetEntity=Clothes.class)
	@JoinColumn(name="CLOTHES_ID7", referencedColumnName="CLOTHES_ID",
	            foreignKey=@ForeignKey(name="FK_ORDER_CLOTHES_ID7"))
	private Clothes clothesId7;
	
	/**CLOTHES_ID8 LONG FK(CLOTHES_ID)*/
	@ManyToMany(fetch=FetchType.LAZY, targetEntity=Clothes.class)
	@JoinColumn(name="CLOTHES_ID8", referencedColumnName="CLOTHES_ID",
	            foreignKey=@ForeignKey(name="FK_ORDER_CLOTHES_ID8"))
	private Clothes clothesId8;
	
	/**CLOTHES_ID9 LONG FK(CLOTHES_ID)*/
	@ManyToMany(fetch=FetchType.LAZY, targetEntity=Clothes.class)
	@JoinColumn(name="CLOTHES_ID9", referencedColumnName="CLOTHES_ID",
	            foreignKey=@ForeignKey(name="FK_ORDER_CLOTHES_ID9"))
	private Clothes clothesId9;
	
	/**CLOTHES_ID10 LONG FK(CLOTHES_ID)*/
	@ManyToMany(fetch=FetchType.LAZY, targetEntity=Clothes.class)
	@JoinColumn(name="CLOTHES_ID10", referencedColumnName="CLOTHES_ID",
	            foreignKey=@ForeignKey(name="FK_ORDER_CLOTHES_ID10"))
	private Clothes clothesId10;
}

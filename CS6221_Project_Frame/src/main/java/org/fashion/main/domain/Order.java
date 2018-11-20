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
public class Order implements Serializable {
	
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

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getName() {
		return name;
	}

	public void setName(Double name) {
		this.name = name;
	}

	public User getEmail() {
		return email;
	}

	public void setEmail(User email) {
		this.email = email;
	}

	public User getAddress() {
		return address;
	}

	public void setAddress(User address) {
		this.address = address;
	}

	public User getPhone() {
		return phone;
	}

	public void setPhone(User phone) {
		this.phone = phone;
	}

	public Short getCondition() {
		return condition;
	}

	public void setCondition(Short condition) {
		this.condition = condition;
	}

	public Clothes getClothesId1() {
		return clothesId1;
	}

	public void setClothesId1(Clothes clothesId1) {
		this.clothesId1 = clothesId1;
	}

	public Clothes getClothesId2() {
		return clothesId2;
	}

	public void setClothesId2(Clothes clothesId2) {
		this.clothesId2 = clothesId2;
	}

	public Clothes getClothesId3() {
		return clothesId3;
	}

	public void setClothesId3(Clothes clothesId3) {
		this.clothesId3 = clothesId3;
	}

	public Clothes getClothesId4() {
		return clothesId4;
	}

	public void setClothesId4(Clothes clothesId4) {
		this.clothesId4 = clothesId4;
	}

	public Clothes getClothesId5() {
		return clothesId5;
	}

	public void setClothesId5(Clothes clothesId5) {
		this.clothesId5 = clothesId5;
	}

	public Clothes getClothesId6() {
		return clothesId6;
	}

	public void setClothesId6(Clothes clothesId6) {
		this.clothesId6 = clothesId6;
	}

	public Clothes getClothesId7() {
		return clothesId7;
	}

	public void setClothesId7(Clothes clothesId7) {
		this.clothesId7 = clothesId7;
	}

	public Clothes getClothesId8() {
		return clothesId8;
	}

	public void setClothesId8(Clothes clothesId8) {
		this.clothesId8 = clothesId8;
	}

	public Clothes getClothesId9() {
		return clothesId9;
	}

	public void setClothesId9(Clothes clothesId9) {
		this.clothesId9 = clothesId9;
	}

	public Clothes getClothesId10() {
		return clothesId10;
	}

	public void setClothesId10(Clothes clothesId10) {
		this.clothesId10 = clothesId10;
	}
	
	
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", date=" + date + ", name=" + name + ", email=" + email + ", address="
				+ address + ", phone=" + phone + ", condition=" + condition + ", clothesId1=" + clothesId1
				+ ", clothesId2=" + clothesId2 + ", clothesId3=" + clothesId3 + ", clothesId4=" + clothesId4
				+ ", clothesId5=" + clothesId5 + ", clothesId6=" + clothesId6 + ", clothesId7=" + clothesId7
				+ ", clothesId8=" + clothesId8 + ", clothesId9=" + clothesId9 + ", clothesId10=" + clothesId10 + "]";
	}
	
}

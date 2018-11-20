package org.fashion.main.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity @Table(name="BILL")
public class Bill implements Serializable {

	private static final long serialVersionUID = -1458758538740339134L;
	
	/** ORDER_ID Automatically_Increasing Primary_Key*/
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="BILL_ID")
	private Long billId;
	
	/** ORDER_DATE	DATE*/
	@Column(name="DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;
	
	/** SUM	DOUBLE*/
	@Column(name="SUM")
	private Double sum;
	
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
	@Column(name="CON")
	private Long con;
	
	/**CLOTHESID1 LONG FK(CLOTHESID)*/
	@ManyToOne(fetch=FetchType.LAZY, targetEntity=Clothes.class)
	@JoinColumn(name="CLOTHESID1", referencedColumnName="CLOTHES_ID",
	            foreignKey=@ForeignKey(name="FK_ORDER_CLOTHESID1"))
	private Clothes clothesId1;
	
	/**CLOTHESID2 LONG FK(CLOTHESID)*/
	@ManyToOne(fetch=FetchType.LAZY, targetEntity=Clothes.class)
	@JoinColumn(name="CLOTHESID2", referencedColumnName="CLOTHES_ID",
	            foreignKey=@ForeignKey(name="FK_ORDER_CLOTHESID2"))
	private Clothes clothesId2;/**CLOTHESID3 LONG FK(CLOTHESID)*/
	@ManyToOne(fetch=FetchType.LAZY, targetEntity=Clothes.class)
	@JoinColumn(name="CLOTHESID3", referencedColumnName="CLOTHES_ID",
	            foreignKey=@ForeignKey(name="FK_ORDER_CLOTHESID3"))
	private Clothes clothesId3;
	
	/**CLOTHESID4 LONG FK(CLOTHESID)*/
	@ManyToOne(fetch=FetchType.LAZY, targetEntity=Clothes.class)
	@JoinColumn(name="CLOTHESID4", referencedColumnName="CLOTHES_ID",
	            foreignKey=@ForeignKey(name="FK_ORDER_CLOTHESID4"))
	private Clothes clothesId4;
	
	/**CLOTHESID5 LONG FK(CLOTHESID)*/
	@ManyToOne(fetch=FetchType.LAZY, targetEntity=Clothes.class)
	@JoinColumn(name="CLOTHESID5", referencedColumnName="CLOTHES_ID",
	            foreignKey=@ForeignKey(name="FK_ORDER_CLOTHESID5"))
	private Clothes clothesId5;
	
	/**CLOTHESID6 LONG FK(CLOTHESID)*/
	@ManyToOne(fetch=FetchType.LAZY, targetEntity=Clothes.class)
	@JoinColumn(name="CLOTHESID6", referencedColumnName="CLOTHES_ID",
	            foreignKey=@ForeignKey(name="FK_ORDER_CLOTHESID6"))
	private Clothes clothesId6;
	
	/**CLOTHESID7 LONG FK(CLOTHESID)*/
	@ManyToOne(fetch=FetchType.LAZY, targetEntity=Clothes.class)
	@JoinColumn(name="CLOTHESID7", referencedColumnName="CLOTHES_ID",
	            foreignKey=@ForeignKey(name="FK_ORDER_CLOTHESID7"))
	private Clothes clothesId7;
	
	/**CLOTHESID8 LONG FK(CLOTHESID)*/
	@ManyToOne(fetch=FetchType.LAZY, targetEntity=Clothes.class)
	@JoinColumn(name="CLOTHESID8", referencedColumnName="CLOTHES_ID",
	            foreignKey=@ForeignKey(name="FK_ORDER_CLOTHESID8"))
	private Clothes clothesId8;
	
	/**CLOTHESID9 LONG FK(CLOTHESID)*/
	@ManyToOne(fetch=FetchType.LAZY, targetEntity=Clothes.class)
	@JoinColumn(name="CLOTHESID9", referencedColumnName="CLOTHES_ID",
	            foreignKey=@ForeignKey(name="FK_ORDER_CLOTHESID9"))
	private Clothes clothesId9;
	
	/**CLOTHESID10 LONG FK(CLOTHESID)*/
	@ManyToOne(fetch=FetchType.LAZY, targetEntity=Clothes.class)
	@JoinColumn(name="CLOTHESID10", referencedColumnName="CLOTHES_ID",
	            foreignKey=@ForeignKey(name="FK_ORDER_CLOTHESID10"))
	private Clothes clothesId10;

	public Long getBillId() {
		return billId;
	}

	public void setBillId(Long billId) {
		this.billId = billId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
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

	public Long getCon() {
		return con;
	}

	public void setCon(Long con) {
		this.con = con;
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
		return "Bill [billId=" + billId + ", date=" + date + ", sum=" + sum + ", email=" + email + ", address="
				+ address + ", phone=" + phone + ", con=" + con + ", clothesId1=" + clothesId1 + ", clothesId2="
				+ clothesId2 + ", clothesId3=" + clothesId3 + ", clothesId4=" + clothesId4 + ", clothesId5="
				+ clothesId5 + ", clothesId6=" + clothesId6 + ", clothesId7=" + clothesId7 + ", clothesId8="
				+ clothesId8 + ", clothesId9=" + clothesId9 + ", clothesId10=" + clothesId10 + "]";
	}
	
}

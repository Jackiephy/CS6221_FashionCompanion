package org.fashion.main.domain;

import java.io.Serializable;

import javax.persistence.*;


@Entity @Table(name="USER")
public class User implements Serializable{

	private static final long serialVersionUID = 8798361091356532548L;
	
	/** UNAME VARCHAR2(200) */
	@Id @Column(name="UNAME",length=200)
	private String uname;
	
	/** PASSWORD VARCHAR2(200) */
	@Column(name="PASSWORD",length=200)
	private String password;
	
	/** PREFERENCE VARCHAR2(200) FK(USER_PREFERENCE) */
	@ManyToOne(fetch=FetchType.LAZY,targetEntity=Clothes.class)
	@JoinColumn(name="PREFERENCE",referencedColumnName="STYLE",
				foreignKey=@ForeignKey(name="FK_USER_PREFERENCE"))
	private Clothes preference;
	
	/** ADDRESS VARCHAR2(200)*/
	@Column(name="ADDRESS",length=200)
	private String address;
	
	/** PHONE VARCHAR2(200)*/
	@Column(name="PHONE",length=200)
	private String phone;

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Clothes getPreference() {
		return preference;
	}

	public void setPreference(Clothes preference) {
		this.preference = preference;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "User [uname=" + uname + ", password=" + password + ", preference=" + preference + ", address=" + address
				+ ", phone=" + phone + "]";
	}
	
}
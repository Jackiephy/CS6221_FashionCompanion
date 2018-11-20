package org.fashion.main.domain;

import java.io.Serializable;

import javax.persistence.*;


@Entity @Table(name="USER")
public class User implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 8798361091356532548L;
	
	
	/** UNAME VARCHAR2(200) */
	@Id @Column(name="UNAME",length=200)
	private String uname;
	
	
	/** PASSWORD VARCHAR2(200) */
	@Column(name="PASSWORD",length=200)
	private String passord;
	
	
	/** PREFERENCE VARCHAR2(200) FK(USER_PREFERENCE) */
	@ManyToMany(fetch=FetchType.LAZY,targetEntity=Clothes.class)
	@JoinColumn(name="PREFERENCE",referencedColumnName="STYLE",
				foreignKey=@ForeignKey(name="FK_USER_PREFERENCE"))
	private Clothes preference;
	
	
	/** ADDRESS VARCHAR2(200)*/
	@Column(name="ADDRESS",length=200)
	private String address;
	
	/** PHONE VARCHAR2(200)*/
	@Column(name="PHONE",length=200)
	private String phone;
	

}

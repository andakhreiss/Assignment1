package com.otv.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * User Entity
 * 
 * @author onlinetechvision.com
 * @since 25 Mar 2012
 * @version 1.0.0
 *
 */
@Entity
@Table(name="USER")
public class User {

	private int id;
	private String name;
	private String surname;
	private long phone;
	private String address;
	
	/**
	 * Get User Id
	 * 
	 * @return int - User Id
	 */
	@Id
	@Column(name="ID", unique = true, nullable = false)
	public int getId() {
		return id;
	}
	
	/**
	 * Set User Id
	 * 
	 * @param int - User Id
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Get User Name
	 * 
	 * @return String - User Name
	 */
	@Column(name="NAME", unique = true, nullable = false)
	public String getName() {
		return name;
	}
	
	/**
	 * Set User Name
	 * 
	 * @param String - User Name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Get User Surname
	 * 
	 * @return String - User Surname
	 */
	@Column(name="SURNAME", unique = true, nullable = false)
	public String getSurname() {
		return surname;
	}
	
	/**
	 * Set User Surname
	 * 
	 * @param String - User Surname
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}	
	
	
	@Column(name="PHONE", unique = true, nullable = false)
	public long getPhone() {
		return phone;
	}
	
	/**
	 * Set User Surname
	 * 
	 * @param String - User Surname
	 */
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	
	@Column(name="ADDRESS", unique = true, nullable = false)
	public String getAddress() {
		return address;
	}
	
	/**
	 * Set User Surname
	 * 
	 * @param String - User Surname
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		StringBuffer strBuff = new StringBuffer();
		strBuff.append("id : ").append(getId());
		strBuff.append(", name : ").append(getName());
		strBuff.append(", surname : ").append(getSurname());
		strBuff.append(", phone:").append(getPhone());
		strBuff.append(", address:").append(getAddress());
		return strBuff.toString();
	}
}

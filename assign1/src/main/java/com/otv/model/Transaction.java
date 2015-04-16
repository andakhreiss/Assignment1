package com.otv.model;

import java.util.Date;

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
@Table(name="TRANSACTION")
public class Transaction {

	private int idTransaction;
	private int idAccount;
	private int toAccNb;
	private int sum;
	
	/**
	 * Get User Id
	 * 
	 * @return int - User Id
	 */
	@Id
	@Column(name="IDTRANSACTION", unique = true, nullable = false)
	
	public int getIdTransaction() {
		return idTransaction;
	}
	
	
	public void setIdTransaction(int idTransaction) {
		this.idTransaction = idTransaction;
	}

	@Column(name="IDACCOUNT", unique = true, nullable = false)
	
	public int getIdAccount() {
		return idAccount;
	}
	
	
	public void setIdAccount(int idAccount) {
		this.idAccount = idAccount;
	}
	
		
	/**
	 * Get User Surname
	 * 
	 * @return String - User Surname
	 */
	@Column(name="TOACCNB", unique = false, nullable = false)
	public int gettoAccNb() {
		return toAccNb;
	}
	
	/**
	 * Set User Surname
	 * 
	 * @param String - User Surname
	 */
	@Column(name="SUM", unique = false, nullable = false)
	public void settoAccNb(int toAccNb) {
		this.toAccNb = toAccNb;
	}	
	
	public int getSum() {
		return sum;
	}
	
	/**
	 * Set User Surname
	 * 
	 * @param String - User Surname
	 */
	public void setSum(int sum) {
		this.sum = sum;
	}
	
	@Override
	public String toString() {
		StringBuffer strBuff = new StringBuffer();
		strBuff.append("idTransaction : ").append(getIdTransaction());
		strBuff.append(", idAccount : ").append(getIdAccount());
		strBuff.append(", toAccNb : ").append(gettoAccNb());
		strBuff.append(", Sum : ").append(getSum());
		
		return strBuff.toString();
	}
}

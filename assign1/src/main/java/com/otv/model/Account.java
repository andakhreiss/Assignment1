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
@Table(name="ACCOUNT")
public class Account {

	private int idAccount;
	private int idClient;
	private String type;
	private String date;
	private int sum;
	private int accNb;
	
	/**
	 * Get User Id
	 * 
	 * @return int - User Id
	 */
	@Id
	@Column(name="IDACCOUNT", unique = true, nullable = false)
	
	public int getIdAccount() {
		return idAccount;
	}
	
	
	public void setIdAccount(int idAccount) {
		this.idAccount = idAccount;
	}
	
		@Column(name="IDCLIENT", unique = true, nullable = false)
		
		public int getIdClient() {
			return idClient;
		}
		
		
		public void setIdClient(int idClient) {
			this.idClient = idClient;
		}
	
	/**
	 * Get User Surname
	 * 
	 * @return String - User Surname
	 */
	@Column(name="SUM", unique = false, nullable = false)
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
	
	@Column(name="TYPE", unique = false, nullable = false)
	public String getType() {
		return type;
	}
	
	/**
	 * Set User Surname
	 * 
	 * @param String - User Surname
	 */
	public void setType(String type) {
		this.type = type;
	}	
	
	
	@Column(name="DATE", unique = false, nullable = false)
	public String getDate() {
		return date;
	}
	
	/**
	 * Set User Surname
	 * 
	 * @param String - User Surname
	 */
	public void setDate(String date) {
		this.date = date;
	}	
	
	
	@Column(name="ACCNB", unique = false, nullable = false)
	public int getAccNb() {
		return accNb;
	}
	
	/**
	 * Set User Surname
	 * 
	 * @param String - User Surname
	 */
	public void setAccNb(int accNb) {
		this.accNb = accNb;
	}
	
	@Override
	public String toString() {
		StringBuffer strBuff = new StringBuffer();
		strBuff.append("idClient : ").append(getIdClient());
		strBuff.append(", idAccount : ").append(getIdAccount());
		strBuff.append(", type : ").append(getType());
		strBuff.append(", date:").append(getDate());
		strBuff.append(", sum:").append(getSum());
		strBuff.append(", accNb:").append(getAccNb());
		return strBuff.toString();
	}


	
}

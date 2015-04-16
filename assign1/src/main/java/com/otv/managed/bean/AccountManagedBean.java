package com.otv.managed.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import org.springframework.dao.DataAccessException;

import com.otv.model.Account;
import com.otv.user.service.IAccountService;

/**
 * 
 * User Managed Bean
 * 
 * @author onlinetechvision.com
 * @since 25 Mar 2012
 * @version 1.0.0
 *
 */
@ManagedBean(name="accountMB")
@RequestScoped
public class AccountManagedBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private static final String SUCCESS = "success";
	private static final String ERROR   = "error";
	
	//Spring User Service is injected...
	@ManagedProperty(value="#{AccountService}")
	IAccountService accountService;
	
	List<Account> accountList;
	
	private int idAccount;
	private int idClient;
	private String type;
	private String date;
	private int sum;
	private int accNb;
	/**
	 * Add User
	 * 
	 * @return String - Response Message
	 */
	public String addAccount() {
		try {
			Account account = new Account();
			account.setIdAccount(getIdAccount());
			account.setIdClient(getIdClient());
			account.setType(getType());
			account.setDate(getDate());
			account.setSum(getSum());
			account.setAccNb(getAccNb());
			getAccountService().addAccount(account);
			return SUCCESS;
		} catch (DataAccessException e) {
			e.printStackTrace();
		} 	
		
		return ERROR;
	}
	
	/**
	 * Reset Fields
	 * 
	 */
	public void reset() {
		this.setIdAccount(0);
		this.setIdClient(0);
		this.setType("");
		this.setDate(date);
		this.setSum(0);
	}
	
	/**
	 * Get User List
	 * 
	 * @return List - User List
	 */
	public List<Account> getAccountList() {
		accountList = new ArrayList<Account>();
		accountList.addAll(getAccountService().getAccounts());
		return accountList;
	}
	
	/**
	 * Get User Service
	 * 
	 * @return IUserService - User Service
	 */
	public IAccountService getAccountService() {
		return accountService;
	}

	/**
	 * Set User Service
	 * 
	 * @param IUserService - User Service
	 */
	public void setAccountService(IAccountService accountService) {
		this.accountService = accountService;
	}
	
	/**
	 * Set User List
	 * 
	 * @param List - User List
	 */
	public void setAccountList(List<Account> accountList) {
		this.accountList = accountList;
	}
	
	/**
	 * Get User Id
	 * 
	 * @return int - User Id
	 */
	public int getIdAccount() {
		return idAccount;
	}

	/**
	 * Set User Id
	 * 
	 * @param int - User Id
	 */
	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public int getIdClient() {
		return idClient;
	}

	/**
	 * Set User Id
	 * 
	 * @param int - User Id
	 */
	public void setIdAccount(int idAccount) {
		this.idAccount = idAccount;
	}
	/**
	 * Get User Name
	 * 
	 * @return String - User Name
	 */
	public String getType() {
		return type;
	}
	
	/**
	 * Set User Name
	 * 
	 * @param String - User Name
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	
	
	public void setDate( String date) {
		this.date = date;
	}
	
	public String getDate() {
		return date;
	}
	
	/**
	 * Set User Surname
	 * 
	 * @param String - User Surname
	 */

	
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
	
	
	public void transferToAccount(int accNr, int sum){
		Account acc= getAccountService().getAccountById(getIdAccount());
		if(accNr== acc.getAccNb())
		{
			acc.setSum(acc.getSum()+ sum);
		}
		
	}
	
	
}
package com.otv.user.service;

import java.util.List;

import com.otv.model.Account;

/**
 * 
 * User Service Interface
 * 
 * @author onlinetechvision.com
 * @since 25 Mar 2012
 * @version 1.0.0
 *
 */
public interface IAccountService {
	
	/**
	 * Add Account
	 * 
	 * @param  Account account
	 */
	public void addAccount(Account account);
	
	/**
	 * Update Account
	 * 
	 * @param  Account account
	 */
	public void updateAccount(Account account);

	/**
	 * Delete Account
	 * 
	 * @param  Account account
	 */
	public void deleteAccount(Account account);
	
	/**
	 * Get Account
	 * 
	 * @param  int Account Id
	 */
	public Account getAccountById(int id);
	
	/**
	 * Get Account List
	 * 
	 * @return List - Account list
	 */
	public List<Account> getAccounts();
}

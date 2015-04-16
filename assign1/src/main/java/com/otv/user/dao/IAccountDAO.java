package com.otv.user.dao;

import java.util.List;

import com.otv.model.Account;

/**
 * 
 * User DAO Interface
 * 
 * @author onlinetechvision.com
 * @since 25 Mar 2012
 * @version 1.0.0
 *
 */
public interface IAccountDAO {

	/**
	 * Add User
	 * 
	 * @param  User user
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
	 */
	public List<Account> getAccounts();
}

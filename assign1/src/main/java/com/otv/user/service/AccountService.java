package com.otv.user.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.otv.model.Account;
import com.otv.user.dao.IAccountDAO;

/**
 * 
 * User Service
 * 
 * @author onlinetechvision.com
 * @since 25 Mar 2012
 * @version 1.0.0
 *
 */
@Transactional(readOnly = true)
public class AccountService implements IAccountService {

	// UserDAO is injected...
	IAccountDAO accountDAO;
	
	/**
	 * Add User
	 * 
	 * @param  User account
	 */
	@Transactional(readOnly = false)
//	@Override
	public void addAccount(Account account) {
		getAccountDAO().addAccount(account);
	}

	/**
	 * Delete Account
	 * 
	 * @param  Account account
	 */
	@Transactional(readOnly = false)
//	@Override
	public void deleteAccount(Account account) {
		getAccountDAO().deleteAccount(account);
	}
	
	/**
	 * Update Account
	 * 
	 * @param  Account account
	 */
	@Transactional(readOnly = false)
//	@Override
	public void updateAccount(Account account) {
		getAccountDAO().updateAccount(account);
	}
	
	/**
	 * Get Account
	 * 
	 * @param  int Account Id
	 */
//	@Override
	public Account getAccountById(int id) {
		return getAccountDAO().getAccountById(id);
	}

	/**
	 * Get Account List
	 * 
	 */
//	@Override
	public List<Account> getAccounts() {	
		return getAccountDAO().getAccounts();
	}

	/**
	 * Get Account DAO
	 * 
	 * @return IAccountDAO - Account DAO
	 */
	public IAccountDAO getAccountDAO() {
		return accountDAO;
	}

	/**
	 * Set Account DAO
	 * 
	 * @param IAccountDAO - Account DAO
	 */
	public void setAccountDAO(IAccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}

}

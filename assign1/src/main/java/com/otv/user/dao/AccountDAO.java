package com.otv.user.dao;



import java.util.List;

import com.otv.model.Account;
import com.otv.model.User;

import org.hibernate.SessionFactory;

public class AccountDAO implements IAccountDAO{
	private SessionFactory sessionFactory;

	/**
	 * Get Hibernate Session Factory
	 * 
	 * @return SessionFactory - Hibernate Session Factory
	 */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/**
	 * Set Hibernate Session Factory
	 * 
	 * @param SessionFactory - Hibernate Session Factory
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
	

	public void addAccount(Account account) {
		getSessionFactory().getCurrentSession().save(account);
	}

	/**
	 * Delete User
	 * 
	 * @param  User user
	 */
//	@Override
	public void deleteAccount(Account account) {
		getSessionFactory().getCurrentSession().delete(account);
	}

	/**
	 * Update User
	 * 
	 * @param  User user
	 */
//	@Override
	public void updateAccount(Account account) {
		getSessionFactory().getCurrentSession().update(account);
	}

	/**
	 * Get User
	 * 
	 * @param  int User Id
	 * @return User 
	 */
//	@Override
	public Account getAccountById(int idAccount) {
		List list = getSessionFactory().getCurrentSession()
											.createQuery("from Account where idAccount=?")
									        .setParameter(0, idAccount).list();
		return (Account)list.get(0);
	}

	/**
	 * Get User List
	 * 
	 * @return List - User list
	 */
//	@Override
	public List<Account> getAccounts() {
		List list = getSessionFactory().getCurrentSession().createQuery("from Account").list();
		return list;
	}

}

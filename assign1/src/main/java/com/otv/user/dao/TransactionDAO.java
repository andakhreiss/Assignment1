package com.otv.user.dao;

import java.util.List;

import com.otv.model.Transaction;

import org.hibernate.SessionFactory;

/**
 * 
 * Transaction DAO
 * 
 * @author onlinetechvision.com
 * @since 25 Mar 2012
 * @version 1.0.0
 *
 */

public class TransactionDAO implements ITransactionDAO {
	
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

	/**
	 * Add Transaction
	 * 
	 * @param  Transaction transaction
	 */
//	@Override
	public void addTransaction(Transaction transaction) {
		getSessionFactory().getCurrentSession().save(transaction);
	}

	/**
	 * Delete Transaction
	 * 
	 * @param  Transaction transaction
	 */
//	@Override
	public void deleteTransaction(Transaction transaction) {
		getSessionFactory().getCurrentSession().delete(transaction);
	}

	/**
	 * Update Transaction
	 * 
	 * @param  Transaction transaction
	 */
//	@Override
	public void updateTransaction(Transaction transaction) {
		getSessionFactory().getCurrentSession().update(transaction);
	}

	/**
	 * Get Transaction
	 * 
	 * @param  int Transaction Id
	 * @return Transaction 
	 */
//	@Override
	public Transaction getTransactionById(int idTransaction) {
		List list = getSessionFactory().getCurrentSession()
											.createQuery("from Transaction where idTransaction=?")
									        .setParameter(0, idTransaction).list();
		return (Transaction)list.get(0);
	}

	/**
	 * Get Transaction List
	 * 
	 * @return List - Transaction list
	 */
//	@Override
	public List<Transaction> getTransactions() {
		List list = getSessionFactory().getCurrentSession().createQuery("from Transaction").list();
		return list;
	}

}

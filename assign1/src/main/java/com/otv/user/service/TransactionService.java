package com.otv.user.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.otv.model.Transaction;
import com.otv.user.dao.ITransactionDAO;

/**
 * 
 * Transaction Service
 * 
 * @author onlinetechvision.com
 * @since 25 Mar 2012
 * @version 1.0.0
 *
 */
@Transactional(readOnly = true)
public class TransactionService implements ITransactionService {

	// TransactionDAO is injected...
	ITransactionDAO transactionDAO;
	
	/**
	 * Add Transaction
	 * 
	 * @param  Transaction transaction
	 */
	@Transactional(readOnly = false)
//	@Override
	public void addTransaction(Transaction transaction) {
		getTransactionDAO().addTransaction(transaction);
	}

	/**
	 * Delete Transaction
	 * 
	 * @param  Transaction transaction
	 */
	@Transactional(readOnly = false)
//	@Override
	public void deleteTransaction(Transaction transaction) {
		getTransactionDAO().deleteTransaction(transaction);
	}
	
	/**
	 * Update Transaction
	 * 
	 * @param  Transaction transaction
	 */
	@Transactional(readOnly = false)
//	@Override
	public void updateTransaction(Transaction transaction) {
		getTransactionDAO().updateTransaction(transaction);
	}
	
	/**
	 * Get Transaction
	 * 
	 * @param  int Transaction Id
	 */
//	@Override
	public Transaction getTransactionById(int id) {
		return getTransactionDAO().getTransactionById(id);
	}

	/**
	 * Get Transaction List
	 * 
	 */
//	@Override
	public List<Transaction> getTransactions() {	
		return getTransactionDAO().getTransactions();
	}

	/**
	 * Get Transaction DAO
	 * 
	 * @return ITransactionDAO - Transaction DAO
	 */
	public ITransactionDAO getTransactionDAO() {
		return transactionDAO;
	}

	/**
	 * Set Transaction DAO
	 * 
	 * @param ITransactionDAO - Transaction DAO
	 */
	public void setTransactionDAO(ITransactionDAO transactionDAO) {
		this.transactionDAO = transactionDAO;
	}

}

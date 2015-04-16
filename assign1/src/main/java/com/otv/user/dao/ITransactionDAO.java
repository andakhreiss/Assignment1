package com.otv.user.dao;

import java.util.List;

import com.otv.model.Transaction;


public interface ITransactionDAO {

	
	public void addTransaction(Transaction transaction);
	
	
	public void updateTransaction(Transaction transaction);
	
	
	public void deleteTransaction(Transaction transaction);
	
	
	public Transaction getTransactionById(int id);
	
	
	public List<Transaction> getTransactions();
}

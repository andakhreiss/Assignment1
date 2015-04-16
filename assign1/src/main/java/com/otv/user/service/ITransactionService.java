package com.otv.user.service;

import java.util.List;

import com.otv.model.Transaction;

public interface ITransactionService {
	

	public void addTransaction(Transaction transaction);
	
	
	public void updateTransaction(Transaction transaction);

	
	public void deleteTransaction(Transaction transaction);
	
	
	public Transaction getTransactionById(int id);
	
	
	public List<Transaction> getTransactions();
}

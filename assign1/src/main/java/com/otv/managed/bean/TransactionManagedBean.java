package com.otv.managed.bean;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import org.springframework.dao.DataAccessException;

import com.otv.model.Account;
import com.otv.model.Transaction;
import com.otv.user.service.AccountService;
import com.otv.user.service.ITransactionService;
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
@ManagedBean(name="transactionMB")
@RequestScoped
public class TransactionManagedBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private static final String SUCCESS = "success";
	private static final String ERROR   = "error";
	
	//Spring User Service is injected...
	@ManagedProperty(value="#{TransactionService}")
	ITransactionService transactionService;
	AccountManagedBean acco;
	List<Transaction> transactionList;
	
	private int idTransaction;
	private int idAccount;
	private int toAccNb;
	private int sum;
	
	
	/**
	 * Add User
	 * 
	 * @return String - Response Message
	 */
	public String addTransaction() {
		try {
			Transaction transaction = new Transaction();
			transaction.setIdTransaction(getIdTransaction());
			transaction.setIdAccount(getIdAccount());
			transaction.settoAccNb(gettoAccNb());
			transaction.setSum(getSum());
		//	acco.transferToAccount(gettoAccNb(),getSum());
			getTransactionService().addTransaction(transaction);
			return SUCCESS;
		} catch (DataAccessException e) {
			e.printStackTrace();
		} 	
		
		return ERROR;
	}
	
	
	public List<Transaction> getTransactionList() {
		transactionList = new ArrayList<Transaction>();
		transactionList.addAll(getTransactionService().getTransactions());
		return transactionList;
	}
	

	public ITransactionService getTransactionService() {
		return transactionService;
	}

	
	public void setTransactionService(ITransactionService transactionService) {
		this.transactionService = transactionService;
	}
	
	
	public void setTransactionList(List<Transaction> transactionList) {
		this.transactionList = transactionList;
	}
	
	
	public int getIdTransaction() {
		return idTransaction;
	}

	
	public void setIdTransaction(int idTransaction) {
		this.idTransaction = idTransaction;
	}

	
	public int getIdAccount() {
		return idAccount;
	}

	
	public void setIdAccount(int idAccount) {
		this.idAccount = idAccount;
	}
	
	public int gettoAccNb() {
		return toAccNb;
	}

	
	public void settoAccNb(int toAccNb) {
		this.toAccNb = toAccNb;
	}

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
	
	
}
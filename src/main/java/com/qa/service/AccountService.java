package com.qa.service;

public interface AccountService {
	
	String getAllAccounts();
	String createAccount(String account);
	String deleteAccount(Long id);


}

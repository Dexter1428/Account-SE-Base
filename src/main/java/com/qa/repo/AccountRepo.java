package com.qa.repo;

public interface AccountRepo {
	
	String getAllAccounts();
	String createAccount(String account);
	String deleteAccount(Long id);

}

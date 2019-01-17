package com.qa.service;

import java.util.HashMap;
import java.util.Map;

import com.qa.domain.Account;

public class AccountServiceMapImp implements AccountService {

	private Map<Integer, Account> accountMap;

	private int count = 0;

	public AccountServiceMapImp() {
		accountMap = new HashMap<>();
	}

	public void addAccountFromMap(Account userAccount) {
		accountMap.put(count, userAccount);
		count++;
	}
 
	public void removeAccountFromMap(Integer accountToRemove) {
		boolean countExists = accountMap.containsKey(accountToRemove);
		if (countExists) {
			accountMap.remove(accountToRemove);
		}
	}
 
	public Map<Integer, Account> getAccountMap() {
		return accountMap;
	}

	public int getNumberOfAccountWithFirstName( String firstNameOfAccount) {
		return (int) accountMap.values().stream()
				.filter(eachAccount -> eachAccount.getFirstName().equals(firstNameOfAccount)).count();
	}

	@Override
	public String getAllAccounts() {
		return null;
	}

	@Override
	public String createAccount(String account) {
		return null;
	}

	@Override
	public String deleteAccount(Long id) {
		return null;
	}

	

}

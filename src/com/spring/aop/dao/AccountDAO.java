package com.spring.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
	
	public void addAccount(Account a)
	{
		System.out.println(getClass()+" Doing DB work adding account");
	}

}

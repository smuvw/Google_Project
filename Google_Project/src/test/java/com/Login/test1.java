package com.Login;

import org.testng.annotations.Test;

public class test1 {
	
	@Test(priority=1,enabled=false)
	public void Login(){
		System.out.println("this is login script");
	}
	
	@Test(priority=2)
	public void Account(){
		System.out.println("this is Account script");
	}
	
	@Test(priority=4)
	public void searchAccount(){
		System.out.println("this is Search Account script");
	}
	
	@Test(priority=5)
	public void EditAccount(){
		System.out.println("this is Search Account script");
	}
	

}

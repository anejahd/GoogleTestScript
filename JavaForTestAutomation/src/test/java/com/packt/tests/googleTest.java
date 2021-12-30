package com.packt.tests;

import org.testng.annotations.Test;

import com.base.BaseTest;
import com.guppypond.googleHome;

public class googleTest extends BaseTest {
	
	@Test
	public void googleAutomationTest() {
		googleHome googlePageHome = new googleHome(driver);
		googlePageHome.open();
		googlePageHome.verifyGoogle();
	}
	

}

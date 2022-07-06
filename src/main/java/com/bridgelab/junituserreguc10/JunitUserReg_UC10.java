package com.bridgelab.junituserreguc10;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JunitUserReg_UC10 {
	
	UserRegImplemtation userreg = new UserRegImplemtation();
	
	@Test
	public void checkFirstName() {
		String testFName = "Ashish";
		assertEquals(true, userreg.validateFName(testFName));
	}
	
	@Test
	public void checkLName() {
		String testLName = "Muley";
		assertEquals(true, userreg.validateLname(testLName));
	}
	
	@Test
	public void checkEmail() {
		String testEmail = "ashishmuley1101@gmail.com";
		assertEquals(true, userreg.valdateEmail(testEmail));
	}
	
	@Test
	public void checkphoneNumber() {
		String testPhoneNumber = "91 9579112523";
		assertEquals(true, userreg.validatephoneNumber(testPhoneNumber));
	}
	
	@Test
	public void checkPwd() {
		String testPwd = "Passwaord@123";
		assertEquals(true, userreg.validatePwd(testPwd));
	}

}
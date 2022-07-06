package com.bridgelab.junituserreguc11;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
	
	@RunWith(Parameterized.class)
	public class UserRegistrationParamterizedTest_UC11 {
		
		private String actualResult;
		private boolean expectedResult;
		private UserRegImplemtation userinput;
		
		public UserRegistrationParamterizedTest_UC11(String actualResult, Boolean expectedResult) {
			this.actualResult = actualResult;
			this.expectedResult = expectedResult;
		}
		
		@Before
		public void init() {
			userinput = new UserRegImplemtation();
		}
		
		@Parameterized.Parameters
		public static Collection emailParamImput() {
			return Arrays.asList(new Object[][] { {"ashishmuley1101@gmail.com", true}, {"abc.co.in.gh", false},
				{"abc.100@abc.com.au", true},{"abc+100@gmail.com", true},{"abc()*@gmail.com", false},{"abc@abc@gmail.com", false}	
				});
		}
		
		@Test
		public void testEmail() {
			assertEquals(expectedResult, userinput.valdateEmail(actualResult));
		}
}

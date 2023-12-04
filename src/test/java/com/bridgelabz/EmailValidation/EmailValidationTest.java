package com.bridgelabz.EmailValidation;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class EmailValidationTest {

	EmailValidation emailValidation;

	@Before
	public void setUp() {
		emailValidation = new EmailValidation();
	}

	// test1
	// 1. abc@yahoo.com Valid for this one
	// 1. abc – must contains “@” symbol

	/*
	 * In this the test method if the given email is validate correctly the it will
	 * pass the test case true
	 */
	@Test
	public void givenEmailMustContainReturnTrue() {
		assertTrue(emailValidation.validateEmailMustContainSpecSymbol("abc@yahoo.com"));
	}

	/*
	 * else this the test method if the given email is invalidate then it will pass
	 * the test case as true
	 */
	@Test
	public void givenEmailShouldNotContainReturnFalse() {
		assertFalse(emailValidation.validateEmailMustContainSpecSymbol("abcgmail.com"));
	}

	// abc-100@yahoo.com this is valid
	// tld can not start with dot “.”
	/*
	 * In this the test method if the given email is validate correctly the it will
	 * pass the test case true
	 */
	@Test
	public void givenEmailTLDCannotStartWithDotReturnTrue() {
		assertTrue(emailValidation.validateEmailTLDCannotStartWithDot("abcXS100@yahoo.com"));
	}

	/*
	 * else this the test method if the given email is invalidate then it will pass
	 * the test case as true
	 */
	@Test
	public void givenEmailTLDCanStartWithDotReturnFalse() {
		assertFalse(emailValidation.validateEmailTLDCannotStartWithDot(".abcgmail.com"));
	}

	/*
	 * In this the test method if the given email is validate correctly the it will
	 * pass the test case true
	 */
//	3. abc123@gmail.a – “.a” is not a valid tld, last tld must contains at least two characters
	@Test
	public void givenEmailCannotEndsWithMinTwoCharReturnTrue() {
		assertTrue(emailValidation.validateEmailTLDCannotStartWithDot("abc100@yahoo.com"));
	}

	/*
	 * else this the test method if the given email is invalidate then it will pass
	 * the test case as true
	 */
	@Test
	public void givenEmailCannotEndsWithMinTwoCharReturnFalse() {
		assertFalse(emailValidation.validateEmailTLDCannotStartWithDot("acas@gmail.co"));
	}

	/*
	 * In this the test method if the given email is validate correctly the it will
	 * pass the test case true
	 */
	// 6. .abc@abc.com – email’s 1st character can not start with “.”
	@Test
	public void givenEmailCannotStartWithDotReturnTrue() {
		assertTrue(emailValidation.validEmailFirstCharCannotStartWithDot("adarsh123@gmai.com"));
	}

	/*
	 * else this the test method if the given email is invalidate then it will pass
	 * the test case as true
	 */
	@Test
	public void givenEmailCanStartWithDotReturnFalse() {
		assertFalse(emailValidation.validEmailFirstCharCannotStartWithDot(".adarsh123@gmail.com"));
	}

	/*
	 * In this the test method if the given email is validate correctly the it will
	 * pass the test case true
	 */
	// 7. abc()*@gmail.com – email’s is only allow character, digit, underscore and
	// dash
	@Test
	public void givenEmailShouldContainCharDigitUnderDashReturnTrue() {
		assertTrue(emailValidation.validateEmailCanAllowOnlyCharDigitUnderscoreDash("adarsh-123@gmai.com"));
	}

	/*
	 * else this the test method if the given email is invalidate then it will pass
	 * the test case as true
	 */
	@Test
	public void givenEmailShouldNotContainCharDigitUnderDashReturnFalse() {
		assertFalse(emailValidation.validateEmailCanAllowOnlyCharDigitUnderscoreDash("adarsh123@gmail.com"));
	}
}

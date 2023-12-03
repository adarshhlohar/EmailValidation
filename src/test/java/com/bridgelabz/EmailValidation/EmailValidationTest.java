package com.bridgelabz.EmailValidation;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class EmailValidationTest {
	
	EmailValidation emailValidation;
	
	@Before
	public void setUp() {
		emailValidation = new EmailValidation();
	}
	
	//test1
	//1. abc@yahoo.com Valid for this one
	//1. abc – must contains “@” symbol
	@Test
	public void test() {
//		assertTrue(emailValidation.validateEmail("abc@yahoo.com"));
//		assertTrue(emailValidation.validateEmail("abcgmail.com"));
	}
	
	//abc-100@yahoo.com this is valid
	//tld can not start with dot “.”
	@Test
	public void test2() {
//		assertTrue(emailValidation.validateEmail2("abcXS100@yahoo.com"));
//		assertTrue(emailValidation.validateEmail2(".abcgmail.com"));
	}
	
	//the email should can not end with only one char it should have min 2 char
	@Test
	public void test3() {
//		assertTrue(emailValidation.validateEmail3("abc100@yahoo.com"));
//		assertTrue(emailValidation.validateEmail("abc@gmail.co"));
	}
	
	//6. .abc@abc.com – email’s 1st character can not start with “.”
	@Test
	public void test4() {
//		assertTrue(emailValidation.validateEmail4("adarsh123@gmai.com"));
//		assertTrue(emailValidation.validateEmail4(".adarsh123@gmail.com"));
	}
	
	
	//7. abc()*@gmail.com – email’s is only allow character, digit, underscore and dash
	@Test
	public void test5() {
		//it will work for the both test cases
		assertTrue(emailValidation.validateEmail5("adarsh-123@gmai.com"));
		assertTrue(emailValidation.validateEmail4("adarsh123@gmail.com"));
	}
}

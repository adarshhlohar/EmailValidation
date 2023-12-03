package com.bridgelabz.EmailValidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	// Validate email must be contain the @ symbol
	//1. abc – must contains “@” symbol
	public boolean validateEmail(String email) {
		Pattern p = Pattern.compile("^[a-zA-Z]+@[a-zA-Z]+\\.com");
		Matcher m = p.matcher(email);
		if(m.matches()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//test2- abc@.com.my – tld can not start with dot “.”
	public boolean validateEmail2(String email) {
		Pattern p = Pattern.compile("^[a-zA-Z0-9]+@[a-zA-Z]+\\.com");
		Matcher m = p.matcher(email);
		if(m.matches()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//3. abc123@gmail.a – “.a” is not a valid tld, last tld must contains at least two
	//characters
	public boolean validateEmail3(String email) {
		Pattern p = Pattern.compile("^[a-zA-Z0-9]+@[a-zA-Z]+\\.[a-z]{2,}");
		Matcher m = p.matcher(email);
		if(m.matches()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//6. .abc@abc.com – email’s 1st character can not start with “.”
	public boolean validateEmail4(String email) {
		Pattern p = Pattern.compile("^[^\\.][a-zA-Z0-9]+@[a-zA-Z]+\\.[a-z]{2,}");
		Matcher m = p.matcher(email);
		if(m.matches()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//7. abc()*@gmail.com – email’s is only allow character, digit, underscore and dash
		public boolean validateEmail5(String email) {
			Pattern p = Pattern.compile("^[^\\.][a-zA-Z0-9-_]+@[a-zA-Z0-9-_]+\\.[a-z]{2,}");
			Matcher m = p.matcher(email);
			if(m.matches()) {
				return true;
			}
			else {
				return false;
			}
		}
}

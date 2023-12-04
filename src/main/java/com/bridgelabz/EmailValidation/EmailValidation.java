package com.bridgelabz.EmailValidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	// Validate email must be contain the @ symbol
	/*
	 * It will Accept The email As String And the pattern will will matches with
	 * that String If the String will Matches it will return true or it will return
	 * false
	 */
	// 1. abc – must contains “@” symbol
	public boolean validateEmailMustContainSpecSymbol(String email) {
		Pattern p = Pattern.compile("^[a-zA-Z]+@[a-zA-Z]+\\.com");
		Matcher m = p.matcher(email);
		if (m.matches()) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * It will Accept The email As String And the pattern will will matches with
	 * that String If the String will Matches it will return true or it will return
	 * false
	 */
	// test2- abc@.com.my – tld can not start with dot “.”
	public boolean validateEmailTLDCannotStartWithDot(String email) {
		Pattern p = Pattern.compile("^[a-zA-Z0-9]+@[a-zA-Z]+\\.com");
		Matcher m = p.matcher(email);
		if (m.matches()) {
			return true;
		} else {
			return false;
		}
	}

	// 3. abc123@gmail.a – “.a” is not a valid tld, last tld must contains at least
	// two characters
	/*
	 * It will Accept The email As String And the pattern will will matches with
	 * that String If the String will Matches it will return true or it will return
	 * false
	 */
	public boolean validateEmailMustBeEndsWithTwoChar(String email) {
		Pattern p = Pattern.compile("^[a-zA-Z0-9]+@[a-zA-Z]+\\.[a-z]{3,}$");
		Matcher m = p.matcher(email);
		if (m.matches()) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * It will Accept The email As String And the pattern will will matches with
	 * that String If the String will Matches it will return true or it will return
	 * false
	 */
	// 6. .abc@abc.com – email’s 1st character can not start with “.”
	public boolean validEmailFirstCharCannotStartWithDot(String email) {
		Pattern p = Pattern.compile("^[^\\.][a-zA-Z0-9]+@[a-zA-Z]+\\.[a-z]{2,}$");
		Matcher m = p.matcher(email);
		if (m.matches()) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * It will Accept The email As String And the pattern will will matches with
	 * that String If the String will Matches it will return true or it will return
	 * false
	 */
	// 7. abc()*@gmail.com – email’s is only allow character, digit, underscore and
	// dash
	public boolean validateEmailCanAllowOnlyCharDigitUnderscoreDash(String email) {
		Pattern p = Pattern.compile("^[^\\.][a-zA-Z0-9]+[_-][a-zA-Z0-9]+@[a-zA-Z0-9-_]+\\.[a-z]{2,}$");
		Matcher m = p.matcher(email);
		if (m.matches()) {
			return true;
		} else {
			return false;
		}
	}
}

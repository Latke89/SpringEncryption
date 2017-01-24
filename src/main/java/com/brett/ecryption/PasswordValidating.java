package com.brett.ecryption;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Brett on 1/24/17.
 */
public class PasswordValidating {

	ArrayList<String> encodedList = new ArrayList<>();
	ArrayList<String> passwordList = new ArrayList<>();
	BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();



	public static void main(String[] args) {

		PasswordValidating validator = new PasswordValidating();
		validator.createPassword();
		validator.encryptPassword();
		validator.validatePassword();

	}

	public void createPassword() {
		String password;
		Scanner inputScanner = new Scanner(System.in);

		for (int count = 0; count < 5; count ++) {
			password = inputScanner.nextLine();
			System.out.println(password);
			passwordList.add(password);
		}

	}


	public void encryptPassword() {

		for (String currentPass : passwordList) {
			String encodedPass = encoder.encode(currentPass);
			System.out.println(encodedPass);
			encodedList.add(encodedPass);
		}

	}

	public void validatePassword() {
		for (int count = 0; count < 5; count ++) {
			String rawPass = passwordList.get(count);
			String encodedPass = encodedList.get(count);
			System.out.println(encoder.matches(rawPass, encodedPass));
		}
	}


}

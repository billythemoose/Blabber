/**
 * CLASS:       CS410 Software Engineering
 * ASSIGNMENT:  Development Phase 1
 * TEAM:        Brandae Grein, Michael Thomas, Alex Kourkoumelis, Matthew Clark, Jordi Monterrubio
**/

// Package Main.
package main.java;

import java.util.Scanner;

public class LogIn
{
	String username;
	String password;

	public LogIn(String username, String password)
	{
		this.username = username;
		this.password = password;
	}

	public void initialize()
	{
		Scanner scan = new Scanner(System.in);
		String usernameInput;
		String passwordInput;
		System.out.print("username: ");
		usernameInput = scan.next();
		System.out.print("password: ");
		passwordInput = scan.next();
		verify(usernameInput, passwordInput);
		scan.close();
	}

	public void verify(String usernameInput, String passwordInput)
	{
		if(usernameInput.equals(username) && passwordInput.equals(password))
		{
			System.out.println("logged in");
		}
		else
		{
			System.out.println("username or password is incorrect");
		}
	}
}

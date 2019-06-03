/**
 * CLASS:       CS410 Software Engineering
 * ASSIGNMENT:  Development Phase 1
 * TEAM:        Brandae Grein, Michael Thomas, Alex Kourkoumelis, Matthew Clark, Jordi Monterrubio
**/

// Package Main.
package main.java;

public class LogInClient
{
	public static void main(String[] args)
	{
		LogIn li = new LogIn("username", "password");
		li.initialize();
	}
}

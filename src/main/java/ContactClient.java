/**
 * CLASS:       CS410 Software Engineering
 * ASSIGNMENT:  Development Phase 1
 * TEAM:        Brandae Grein, Michael Thomas, Alex Kourkoumelis, Matthew Clark, Jordi Monterrubio
**/

// Package Main.
package main.java;

public class ContactClient
{
	public static void main(String[] args)
	{
		Contact c = new Contact("username");
		c.showInfo();
		System.out.println();
		c.switchBlocked();
		c.recordConversation("Hi");
		c.recordConversation("Hello");
		c.showInfo();
	}
}

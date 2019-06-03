/**
 * CLASS:       CS410 Software Engineering
 * ASSIGNMENT:  Development Phase 1
 * TEAM:        Brandae Grein, Michael Thomas, Alex Kourkoumelis, Matthew Clark, Jordi Monterrubio
**/

// Package Main.
package main.java;

import java.util.ArrayList;
import java.util.List;

public class Contact
{
	String username;
	boolean blocked;
	List<String> conversations;

	public Contact(String username)
	{
		this.username = username;
		blocked = false;
		conversations = new ArrayList<>();
	}

	public String getUsername()
	{
		return username;
	}

	public boolean isBlocked()
	{
		return blocked;
	}

	public void switchBlocked()
	{
		if(blocked) {
			blocked = false;
		} else {
			blocked = true;
		}
	}

	public void recordConversation(String s)
	{
		conversations.add(s);
	}

	public void viewConversations()
	{
		for(int i = 0; i < conversations.size(); i++)
		{
			System.out.println(conversations.get(i));
		}
	}

	public void showInfo()
	{
		System.out.println(username);
		System.out.println("blocked = " + blocked);
		viewConversations();
	}
}

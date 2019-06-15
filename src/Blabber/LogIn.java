/**
 * CLASS:       CS410 Software Engineering
 * ASSIGNMENT:  Development Phase 1
 * TEAM:        Brandae Grein, Michael Thomas, Alex Kourkoumelis, Matthew Clark, Jordi Monterrubio
**/
// Package Main.
package Blabber;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class LogIn {
	private Map<String, String> hashedAccPass = new HashMap<>();
	private String fileName = "Blabber/login.txt";


	public LogIn() {
		String line = "";

		try {
			FileReader fileReader = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			while ((line = bufferedReader.readLine()) != null) {
				String[] arr = line.split("   ");
				hashedAccPass.put(arr[0], arr[1]);
			}
			bufferedReader.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to find database containing login info.");
		} catch (IOException ex) {
			System.out.println("Error reading database login contents.");
			ex.printStackTrace();
		}
	}

	private String encrypt(String username, String password) {
		username += ".";
		username += password;
		password = "";
		for (int i = 0; i < username.length(); i++) {
			char c = username.charAt(i);
			if (i % 2 == 0) {
				c += 3;
			} else {
				c -= 2;
			}
			password += Character.toString(c);
		}

		return password;
	}

	private boolean exists(String username) {
		return hashedAccPass.containsKey(username);
	}

	public void createAccount(String username, String password) {
		String newAcc = username;
		newAcc += "   ";
		newAcc += encrypt(username, password);

		hashedAccPass.put(username, encrypt(username, password));

		try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName),
				"utf-8"))) {
			for(Map.Entry<String, String> entry : hashedAccPass.entrySet()) {
				writer.write(entry.getKey() + "   " + entry.getValue() + "\n");
			}
		} catch (IOException ex) {
			System.out.println("Error reading database login contents.");
			ex.printStackTrace();
		}
	}

	public boolean validate(String username, String password) {
		if(exists(username)){
			return (hashedAccPass.get(username).equals(encrypt(username, password)));
		} else {
			return false;
		}
	}
}
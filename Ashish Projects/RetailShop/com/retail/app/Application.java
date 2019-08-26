package com.retail.app;

import java.util.Scanner;

import com.retail.store.dao.impl.PurchaseDaoImpl;
import com.retail.store.dao.impl.UserDaoImpl;
import com.retail.store.dao.impl.UserRoleDaoImpl;
import com.retail.store.service.PurchaseService;
import com.retail.store.service.UserService;
import com.retail.store.service.impl.PurchaseServiceImpl;
import com.retail.store.service.impl.UserServiceImpl;

public class Application {

	public static void main(String args[]) {
		UserService userService = new UserServiceImpl(new UserDaoImpl(), new UserRoleDaoImpl());
		PurchaseService purchaseService = new PurchaseServiceImpl(new PurchaseDaoImpl());
		
		Scanner scanner = new Scanner(System.in);
		int option = 0;
		boolean exitSelected = false;
		while(!exitSelected) {
			System.out.println("\nPlease select a operation to perform :-");
			System.out.println("\n1. Create a User.");
			System.out.println("\n2. Make Purchase.");
			System.out.println("\n3. View purchase data.");
			System.out.println("\n4. View purchase data.");
			String input = scanner.next();
			try {
				option = Integer.parseInt(input);
			} catch (Exception e) {
				System.out.println("\nInvalid option selected entered. Please try again.");
				continue;
			}
			if (option < 1 && option > 4) {
				System.out.println("\nInvalid option selected entered. Please try again.");
				continue;
			}
			switch(option) {
				case 1:
					userService.createUserFromConsole(scanner);
					break;
				case 2:
					//make purchase
					break;
				case 3:
					//view purchase data
					break;
				case 4:
					exitSelected = true;
					System.out.println("The program will terminate soon.");
			}
		}
		
		scanner.close();
		userService = null;
		purchaseService = null;
		System.out.println("The program is terminating now.");
	}
}

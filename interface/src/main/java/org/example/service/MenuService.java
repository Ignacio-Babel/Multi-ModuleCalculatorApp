package org.example.service;

import org.springframework.stereotype.Service;

import java.util.Scanner;
@Service
public class MenuService implements IMenuService {
	Scanner scanner = new Scanner(System.in);

	public int askUserForOperation(){
		System.out.println("Choose operation:");
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		System.out.println("5. Exit");
		return scanner.nextInt();
	}

	public double askUserFirstValue(){
		System.out.println("Enter first number: ");
		return (scanner.nextDouble());
	}

	public double askUserSecondValue(){
		System.out.println("Enter second number: ");
		return (scanner.nextDouble());
	}

	public void printOutSolutionToUser(double solution){
		System.out.println("The result of your operation is " + solution);
	}
}

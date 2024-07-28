package jarii.com.calculator;

import java.util.*;


public class Calculator {


	public static void main(String[] args) {
		
		String choose;
		Menu menu = new Menu();
		Compute comp = new Compute();
		System.out.println("I'm a calculator. Please choose from the menu");
		
		
		while(true) {
			menu.printMenu();
			choose = menu.menuAction();
			System.out.println(choose);
			if(choose.equalsIgnoreCase("e")){
				break;
				}
			comp.computeIt(choose);
		}
		
		
		System.out.println("Thankz, quitting.");
		IOhelper.closeScanner();
	}
}		
		
		


package jarii.com.calculator;

import java.util.ArrayList;
import java.util.Arrays;

public class Menu {

	public void printMenu(){
		System.out.println("Menu:\n"+
				"A:Calculate sum\n"+
				"B:Calculate a subdivision\n"+
				"C:Calculate a multiplication\n"+
				"D:Calculate a division\n"+
				"E:Quit");
	}
	
	public String menuAction() {
		
		String action;
		String[] legal = {"a","b","c","d","e","A","B","C","D","E"};
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(legal));
		
	
		action = IOhelper.getScanner().next();
		System.out.println(action);
		
		while(true) {
			if(list.contains(action)) {
				break;
				}
			else {
				System.out.println("Please give a legal option: ");
				action = IOhelper.getScanner().next();
				}
			}
		
		return action;
	}
		
	}
	


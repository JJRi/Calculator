package jarii.com.calculator;

public class Compute {
	
	void computeIt(String choose) {
		float in1=0;
		float in2=0;
		float result=42;
		
		choose = choose.toUpperCase();
		try {
		//System.out.println("computeIT: "+choose);
			System.out.println("First number please: ");
			in1 = IOhelper.getScanner().nextFloat();
			
					
			System.out.println("Second number please: ");
			in2 = IOhelper.getScanner().nextFloat();
			
			switch(choose) {
				case "A": result = in1 + in2;
					break;
				case "B": result = in1 - in2;
					break;
				case "C": result = in1 * in2;
				break;
				case "D": result = in1 / in2;
				break;
			
			}

			System.out.println("Result is: "+result);
		}
		catch(Exception e) {
			System.out.println("Not a valid number, returning to menu!");
		}
		
	}

}

package alterNATIVE;

import java.util.Scanner;

public class Menu {
	
	public Menu() {
		
	}
	
	public void displayOptions(Boolean parsed) {
		displaySpacing();
		if(!parsed) {
			nlPrint("Please select from one of the following options: \n");
			nlPrint("1: Parse a sample program");
			nlPrint("2: Write a program");
		}else {
			nlPrint("Please select from one of the following options: \n");
			nlPrint("1: Parse a sample program");
			nlPrint("2: Write a program");
			nlPrint("3: Display the parse tree graphically");
			nlPrint("4: Display the parse tree in console (indented)");
			nlPrint("5: Open HTML page containing the result\n");
		}
		
	}
	
	public int getSelection() {
		
		Scanner sc = new Scanner(System.in);
//TODO Exception handling
		int input = sc.nextInt();
		
		sc.close();

		return input;
	}
	
	public void handleSelection(int selection) {
		switch(selection) {
		
		case 1:
			
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			
			break;
		
		
		
		}
	}
	
	
	
	private void displaySpacing() {
		nlPrint("\n\n");
	}
	
	private void nlPrint(String toPrint) {
		System.out.println(toPrint);
	}
	private void print(String toPrint) {
		System.out.print(toPrint);
	}

}

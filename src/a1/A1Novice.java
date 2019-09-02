package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		 
		 int customers = scan.nextInt();
		 for (int i = 0; i < customers; i++) {
			 double total = 0.0;
			 int items = scan.nextInt();
			for (int x = 0; x < items; x++) {
				 int quantity = scan.nextInt();
				 System.out.println(quantity);
				 double price = scan.nextDouble();
				 System.out.println(price);
				 total += quantity * price;
				 System.out.println(total);
			}
			String first = scan.next();
			char firstInt = first.charAt (0);
			String last = scan.next();
			String totalString = Double.toString(total);
			System.out.println(firstInt + ". " + last + ": " + totalString);
		}
	
	}
	
	
}




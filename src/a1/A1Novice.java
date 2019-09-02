package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		 
		 int customers = scan.nextInt();
		 System.out.println(customers);
		 for (int i = 0; i < customers; i++) {
			 String first = scan.next();
			 char firstInt = first.charAt (0);
			 String last = scan.next();
			 double total = 0.0;
			 int items = scan.nextInt();
			 System.out.println(items);
			 for (int x = 0; x < items; x++) {
				int quantity;
				quantity = scan.nextInt();
				double price;
				price = scan.nextDouble();
			    total += quantity * price;
			 }
			 
			System.out.println(firstInt + ". " + last + ": " + String.format("%.2f", total));
		}
	
	}
	
	
}




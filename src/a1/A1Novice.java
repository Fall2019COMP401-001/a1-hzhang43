package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		 
		 int customers = scan.nextInt();
		 int items = scan.nextInt();
		 //System.out.println(customers);
		 for (int i = 0; i < customers; i++) {
			 double total = 0.0;
			 //System.out.println(items);
			 for (int x = 0; x < items; x++) {
				int quantity;
				quantity = scan.nextInt();
				double price;
				price=scan.nextDouble();
				//System.out.println(quantity);
				double cost;
				cost=quantity*price;
				//System.out.println(total);
			    total = total + cost;
			 }
			 
			String first = scan.next();
			char firstInt = first.charAt (0);
			String last = scan.next();
			String totalString = Double.toString(total);
			System.out.println(firstInt + ". " + last + ": " + totalString);
		}
	
	}
	
	
}




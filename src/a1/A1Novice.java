package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		 
		 int customers = scan.nextInt();
		 for (int i = 0; i < customers; i++) {
			 String first = scan.next();
			 char firstInt = first.charAt (0);
			 String last = scan.next();
			 double total = 0.0;
			 int items = scan.nextInt();
			 for (int x = 0; x < items; x++) {
				int	quantity = scan.nextInt();
				String food = scan.next();
				double price = scan.nextDouble();
			    total += quantity * price;
			 }
			 
			System.out.println(firstInt + ". " + last + ": " + String.format("%.2f", total));
		}
	
	}
	
	
}




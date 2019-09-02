package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		  for (int i = 0; i < scan.nextInt(); i++) {
			 double total = 0.0;
			 for (int x = 0; x < scan.nextInt(); x++) {
				 int quantity = scan.nextInt();
				 double price = scan.nextDouble();
				 total += quantity * price;
			}
			String first = scan.next();
			char firstInt = first.charAt (0);
			String last = scan.next();
			System.out.println(firstInt + ". " + last + ": " + total);
		  }
	
	}
	
}



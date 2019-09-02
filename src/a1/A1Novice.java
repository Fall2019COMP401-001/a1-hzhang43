package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		 // for (int i = 0; i < scan.nextInt(); i++) {
			 double total = 0.0;
			// for (int x = 0; x < scan.nextInt(); x++) {
				 int quantity = scan.nextInt();
				 System.out.println(quantity);
				 double price = scan.nextDouble();
				 System.out.println(price);
				 total += quantity * price;
				 System.out.println(total);
			//}
			String first = scan.next();
			char firstInt = first.charAt (0);
			String last = scan.next();
			String totalString = Double.toString(total);
			System.out.println(firstInt + ". " + last + ": " + totalString);
		// }
	
	}
	
	
}




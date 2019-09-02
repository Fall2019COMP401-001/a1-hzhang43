package a1;

import java.util.Arrays;
import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		String[] food = new String[count];
		double[] price = new double[count];
		for (int i = 0; i < count; i++) {
			food[i] = scan.next();
			price[i] = scan.nextDouble();
		}
		//System.out.println(Arrays.toString(food));
		//System.out.println(Arrays.toString(price));
		int customers = scan.nextInt();
		double max = 0.0;
		double min = 99999.99;
		String maxName = "";
		String minName = "";
		double sum = 0;
		for (int x = 0; x < customers; x++) {
			String first = scan.next();
			String last = scan.next();
			double total = 0.0;
			int items = scan.nextInt();
			for (int y = 0; y < items; y++) {
				int quantity = scan.nextInt();
				String itemName = scan.next();
				double itemPrice = 0;
				for (int z = 0; z < count; z++) {
					if (food[z] == itemName) {
						itemPrice = price[z];
					}
				}
				total += quantity * itemPrice;
				sum += total;
			}
			if (total > max) {
				max = total;
				maxName = first + " " + last;
			} else if (total < min) {
				min = total;
				minName = first + " " + last;
			}
		}
		double average = sum / customers;
		System.out.println("Biggest: " + maxName + " (" + max + ")");
		System.out.println("Smallest: " + minName + " (" + min + ")");
		System.out.println("Average: " + String.format("%.2f", average));
	}
}

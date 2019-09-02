package a1;

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
		System.out.println(food);
		System.out.println(price);
		
	}
}

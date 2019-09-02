package a1;

import java.util.Arrays;
import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int count = scan.nextInt();
		String[] food = new String[count];
		double[] price = new double[count];
		int[] foodCount = new int[count];
		int[] customerCount = new int[count];
		boolean[] bought = new boolean[count];
		//System.out.println(Arrays.toString(bought));
		for (int i = 0; i < count; i++) {
			food[i] = scan.next();
			price[i] = scan.nextDouble();
		}
		int customers = scan.nextInt();
		for (int x = 0; x < customers; x++) {
			String first = scan.next();
			String last = scan.next();
			int items = scan.nextInt();
			for (int y = 0; y < items; y++) {
				int num = scan.nextInt();
				String itemName = scan.next();
				for (int z = 0; z < count; z++) {
					if (food[z].equals(itemName)) {
						foodCount[z] += num;
						if (bought[z]) {
							bought[z] = true;
						} else {
							customerCount[z] += 1;
							bought[z] = true;
						}
					
					}
				}
			
			}
		
		}
		for (int index = 0; index < count; index++) {
			if (customerCount[index] == 0) {
				System.out.println("No customers bought " + food[index]);
			} else {
				System.out.println(customerCount[index] + " customers bought " + foodCount[index] + " " + food[index]);
			}
		}
	}
}

package org.cap.demo.hackerrankexampl;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PriceCheck {
	public static void main(String[] args) {
		Integer numberOfPriceCheckpro = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the Number of Products : ");
		Integer n = sc.nextInt();
		String[] products = new String[n];
		
		System.out.println("Please enter the Products : ");
		for (int i = 0; i < n; i++) {
			products[i] = sc.next();
		}
		Map<String, String> prodPricesMap = new LinkedHashMap<>();
		System.out.println("Please enter the Products prices: ");
		for (int i = 0; i < n; i++) {
			prodPricesMap.put(products[i], sc.next());

		}

		System.out.println("Please enter the Number of Sold Products : ");
		Integer n2 = sc.nextInt();
		String[] soldProducts = new String[n2];
		String[] soldProductPrices = new String[n2];
		System.out.println("Please enter the Products : ");

		for (int i = 0; i < n2; i++) {
			soldProducts[i] = sc.next();
		}

		System.out.println("Please enter the Products prices: ");
		for (int i = 0; i < n2; i++) {
			soldProductPrices[i] = sc.next();
			if (!prodPricesMap.get(soldProducts[i]).equals(soldProductPrices[i])) {
				numberOfPriceCheckpro++;
			}

			System.out.println(numberOfPriceCheckpro);
		}
	}

}

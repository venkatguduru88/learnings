package org.cap.demo.hackerrankexampl;

import java.util.Scanner;

public class Operators {
	
	public static void main(String[] args) {
		Double finalMealCost=0.0d;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the Meal Cost : ");
		Double mealCost= sc.nextDouble();
		System.out.println("Please enter the Tip percent : ");
		Integer tipPercent= sc.nextInt();
		System.out.println("Please enter the Tax percent : ");
		Integer taxPercent= sc.nextInt();
		Double tipAmont=mealCost*tipPercent/100;
		Double taxAmont=mealCost*taxPercent/100;
		finalMealCost=mealCost+tipAmont+taxAmont;
		System.out.println("Meal cost including Tax and Tip : "+Math.round(finalMealCost));
		
	}

}

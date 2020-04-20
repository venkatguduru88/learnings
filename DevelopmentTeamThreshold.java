package org.cap.demo.hackerrankexampl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DevelopmentTeamThreshold {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the Number of Temas : ");
		Integer n = sc.nextInt();
		List<Integer[]> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			Integer team[] = new Integer[2];
			for (int j = 0; j < 2; j++) {
				team[j] = sc.nextInt();
			}
			list.add(team);
		}
		Integer senDev = 0;
		Integer totTeamMem = 0;
		double temp_senDec = 0;
		double temp_totTeamMem = 0;
		double percentage = 0.0;
		for (Integer[] teams : list) {

			senDev = senDev + teams[0];
			totTeamMem = totTeamMem + teams[1];

		}
		temp_senDec = senDev;
		temp_totTeamMem = totTeamMem;
		int num=0;
		for(int i=0;percentage<60;i++) {
			percentage = (double)(temp_senDec / temp_totTeamMem) * 100;
			temp_senDec++;
			temp_totTeamMem++;
			num=i;
		}
		System.out.println( num);

	}

}

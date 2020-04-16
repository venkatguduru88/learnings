package com.test.rollstring;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Java program to find number of possible moves of knight 
public class KnightMinMoves {

	// To calculate possible moves
	static int findMinMoves(int n, int start_row, int star_col, int end_row, int end_col) {
		// All possible moves of a knight
		int X[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
		int Y[] = { 1, 2, 2, 1, -1, -2, -2, -1 };

		List<Integer> count = new ArrayList<>();

		if (start_row < 0 && star_col < 0 && end_row > n && end_col > n) {
			return -1;
		}

		// Check if each possible move is valid or not
		for (int i = 0; i < 8; i++) {
			// Position of knight after move
			int c = 1;
			int x = start_row;
			int y = star_col;
			x = x + X[i];
			y = y + Y[i];
			if (x == end_row && y == end_col) {
				if (x >= 0 && y >= 0 && x < n && y < n) {
					count.add(i);
				}
			}

			for (int j = 0; j < 8; j++) {
				// int cc=c;
				int xx = x;
				int yy = y;
				xx = xx + X[j];
				yy = yy + Y[j];
				if (xx == end_row && yy == end_col) {
					if (x >= 0 && y >= 0 && x < n && y < n) {
						count.add(c + 1);
						break;
					}

				}

			}

		}
		Collections.sort(count);
		int minmoves = -1;
		if (count.size() >= 1) {
			minmoves = count.get(0);
		}
		System.out.println(count);
		return minmoves;
	}

	// Driver program to check findPossibleMoves()
	public static void main(String[] args) {

		System.out.println(findMinMoves(10, 4, 4, 4, 8));
	}
}

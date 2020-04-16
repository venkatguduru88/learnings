package com.test.rollstring;

//Java program to find number of possible moves of knight 
public class KnightMinMoves {

	// To calculate possible moves
	static int findMinMoves(int n, int start_row, int star_col, int end_row, int end_col) {
		// All possible moves of a knight
		int X[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
		int Y[] = { 1, 2, 2, 1, -1, -2, -2, -1 };

		int count = 0;

		if (start_row >= 0 && star_col >= 0 && end_row < n && end_col < n) {
			return -1;
		}

		int diff_row = start_row - end_row;
		int diff_col = star_col - end_col;

		while (diff_col <= 0) {
			diff_col = diff_col / 2;
			// Y.i
		}

		// Check if each possible move is valid or not
		for (int i = 0; i < 8; i++) {
			// Position of knight after move
			int x = start_row + X[i];
			int y = star_col + Y[i];

			// count valid moves
			if (x >= 0 && y >= 0 && x < n && y < n) {
				System.out.println(X[i] + "," + Y[i]);
				count++;
			}
		}

		// Return number of possible moves
		return count;
	}

	// Driver program to check findPossibleMoves()
	public static void main(String[] args) {

		System.out.println(findMinMoves(4, 0, 1, 4, 8));
	}
}

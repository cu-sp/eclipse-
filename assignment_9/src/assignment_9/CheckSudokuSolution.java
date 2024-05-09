package assignment_9;
import java.util.Scanner;

public class CheckSudokuSolution {
    public static void main(String[] args) {
        // Read a Sudoku solution
        int[][] grid = readASolution();
        int[][] validSudokuSolution = {
        	    {5, 3, 4, 6, 7, 8, 9, 1, 2},
        	    {6, 7, 2, 1, 9, 5, 3, 4, 8},
        	    {1, 9, 8, 3, 4, 2, 5, 6, 7},
        	    {8, 5, 9, 7, 6, 1, 4, 2, 3},
        	    {4, 2, 6, 8, 5, 3, 7, 9, 1},
        	    {7, 1, 3, 9, 2, 4, 8, 5, 6},
        	    {9, 6, 1, 5, 3, 7, 2, 8, 4},
        	    {2, 8, 7, 4, 1, 9, 6, 3, 5},
        	    {3, 4, 5, 2, 8, 6, 1, 7, 9}
        	};

        System.out.println(isValid(grid) ? "Valid solution" : "Invalid solution"); 
        System.out.println(isValid(validSudokuSolution) ? "Valid solution" : "Invalid solution"); 
    }

	public static int[][] readASolution() {
		// Create a Scanner
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter a Sudoku puzzle solution:");
		int[][] grid = new int[9][9];

		// Complete the method here.

		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				System.out.println("enter number for "+(i+1)+"x"+(j+1)+ ": ");
				grid[i][j] = scn.nextInt();
			}
		}
		
		scn.close();
		return grid;
	}

	/*
	 * Check whether a solution is valid
	 */

	public static boolean isValid(int[][] grid) {
		// Complete the method.
		// Check each row
	    for (int row = 0; row < 9; row++) {
	        if (!isValidRow(grid, row))
	            return false;
	    }

	    // Check each column
	    for (int col = 0; col < 9; col++) {
	        if (!isValidColumn(grid, col))
	            return false;
	    }

	    // Check each 3x3 subgrid
	    for (int row = 0; row < 9; row += 3) {
	        for (int col = 0; col < 9; col += 3) {
	            if (!isValidSubgrid(grid, row, col))
	                return false;
	        }
	    }

	    return true; // If all checks pass, the solution is valid
	}
	
	// Helper method to check if a row is valid
	private static boolean isValidRow(int[][] grid, int row) {
	    boolean[] visited = new boolean[10]; // For numbers 1 to 9
	    for (int col = 0; col < 9; col++) {
	        int num = grid[row][col];
	        if (num != 0) {
	            if (visited[num]) // If number is already visited in this row
	                return false;
	            visited[num] = true;
	        }
	    }
	    return true;
	}

	// Helper method to check if a column is valid
	private static boolean isValidColumn(int[][] grid, int col) {
	    boolean[] visited = new boolean[10]; // For numbers 1 to 9
	    for (int row = 0; row < 9; row++) {
	        int num = grid[row][col];
	        if (num != 0) {
	            if (visited[num]) // If number is already visited in this column
	                return false;
	            visited[num] = true;
	        }
	    }
	    return true;
	}

	// Helper method to check if a 3x3 subgrid is valid
	private static boolean isValidSubgrid(int[][] grid, int startRow, int startCol) {
	    boolean[] visited = new boolean[10]; // For numbers 1 to 9
	    for (int row = startRow; row < startRow + 3; row++) {
	        for (int col = startCol; col < startCol + 3; col++) {
	            int num = grid[row][col];
	            if (num != 0) {
	                if (visited[num]) // If number is already visited in this subgrid
	                    return false;
	                visited[num] = true;
	            }
	        }
	    }
	    return true;
}
}
	
	
	
	
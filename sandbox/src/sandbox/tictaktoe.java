package sandbox;
import java.util.Scanner;
public class tictaktoe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] tictaktoe = {{"-","-","-"},{"-","-","-"},{"-","-","-"}};
        Scanner scn = new Scanner (System.in);
        for (int i = 0; i < 9; i++) {
        	int[] pos = {0,0};
        	String value = new String();
        	printBoard(tictaktoe);
        	System.out.print("enter 2 numbers coorespoding to your position: \nx: ");
        	pos[0] = scn.nextInt();
        	System.out.print("y: ");
        	pos[1] = scn.nextInt();
            if (i % 2 == 0){
            	value = "o";
            }
            else {
            	value = "x";
            }
            if (tictaktoe[pos[0]][pos[1]] == "-") {
            	tictaktoe[pos[0]][pos[1]] = value;
            }
            else {
            	System.out.println("invalid move");
            	i--;
            }
            if (hasWon(tictaktoe) == true) {
            	System.out.println("won");
            }
            
    	}
    }
        
    public static void printBoard(String[][] board) {
        for (String[] row : board) {
            for (String cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }	
	
	public static boolean hasWon(String[][] tictaktoe) {
		boolean result = false;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				result = checkRow(i,j,tictaktoe);
				if (result == true) {
					return result;
				}
				/*result = checkColumn(i,j,tictaktoe);
				if (result == true) {
					return result;
				}
				result = checkDiag(i,j,tictaktoe);
				if (result == true) {
					return result;
				}
				}
			}
		return result;
		}
	*/
	
	public static boolean checkRow(int i, int j, String[][] tictaktoe) {
		boolean result = false;
		for(int row = 0; row < 2; row++) {
			if (j != row && tictaktoe[i][j] == tictaktoe[row][j]) {
				result = true;
			}
			else {
				result = false;
			}
		}
		return result;
	}
	public static boolean checkColumn(int i, int j, String[][] tictaktoe) {
		boolean result = false;
		for(int column = 0; column < 2; column++) {
			if (tictaktoe[i][column] == "e") {
				return result;
			}
			if (i != column && tictaktoe[i][j] == tictaktoe[i][column]) {
				result = true;
			}
			else {
				result = false;
			}
		}
		return result;
	}
	public static boolean checkDiag(int i, int j, String[][] tictaktoe) {
		boolean result = false;
		for(int diag = 0; diag < 2; diag++) {
			if (tictaktoe[i][j] != "e" || j == i || (i == 2 && j == 0) || (i == 0 && j == 2) && tictaktoe[i][j] == tictaktoe[diag][diag]) {
				result = true;
			}
			else {
				result = false;
			}
		}
		return result;
	}
}

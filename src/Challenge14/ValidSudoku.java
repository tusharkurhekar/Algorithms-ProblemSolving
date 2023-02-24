/**
 * 
 */
package Challenge14;

import java.util.HashSet;
import java.util.Set;

/**
 * @author tusharkurhekar
 *
 */
public class ValidSudoku {

	/**
	 * 
	 */
	public boolean ValidSudoku(char[][] board) {
	    Set seen = new HashSet();
	    for (int i=0; i<9; ++i) {
	        for (int j=0; j<9; ++j) {
	            if (board[i][j] != '.') {
	                String b = "(" + board[i][j] + ")"; //this gives number
	                if (!seen.add(b + i) || !seen.add(j + b) || !seen.add(i/3 + b + j/3)){
	                    // System.out.println(seen);
	                    //conditions will fail if thing are unable to add , as it will be present
	                    //and as hashset can only contain enique values 
	                    return false;
	                    }
	            }
	        }
	    }
	    return true;
	}

}

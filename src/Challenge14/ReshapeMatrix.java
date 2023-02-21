/**
 * 
 */
package Challenge14;

/**
 * @author tusharkurhekar
 *
 */
public class ReshapeMatrix {

	/**
	 * 
	 */
	public int [][] ReshapeMatrix(int[][] mat, int r, int c) {
        
        int row = mat.length;
        int column = mat[0].length;
        
        int [][] output_mat = new int[r][c];

        if( row * column != r*c ) return mat;

        int row_num=0;
        int col_num=0; 

        for(int i =0 ; i<row ;i++){
            for(int j=0; j< column;j++){
                
                output_mat[row_num][col_num] = mat[i][j];
                col_num++;
                if(col_num == c){
                    col_num=0;
                    row_num++;
                }

            }
        }
        
        return output_mat;
	}

}

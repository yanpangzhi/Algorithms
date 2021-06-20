import java.util.ArrayList;

//输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字
public class ClockPrintMatrix {
	ArrayList<Integer> arr = new ArrayList<>();
	public ArrayList<Integer> printMatrix(int [][] matrix){
		if(matrix ==null)
			return arr;
		int row = matrix.length-1;
		int col = matrix[0].length-1;
		int startrow= 0;
		int startcol = 0;
		while(startrow<=row && startcol<=col) {
			printCircle(matrix, row, col, startrow, startcol);
			startrow++;
			startcol++;
			row--;
			col--;			
		}
		return arr;
	}
	
	public void printCircle(int [][]matrix,int row,int col,int startrow,int startcol){
		int currow = startrow;
		int curcol = startcol;
		//仅有一行
		if(startrow == row) {
			for(;curcol<=col;curcol++) {
				arr.add(matrix[startrow][curcol]);
			}
		}
		//仅有一列
		else if(startcol ==col) {
			for(;currow<=row;currow++) {
				arr.add(matrix[currow][startcol]);
			}
		}
		//转圈打印
		else {
			while(curcol<col){
				arr.add(matrix[startrow][curcol]);
				curcol++;
			}
			while(currow<row) {
				arr.add(matrix[currow][col]);
				currow++;
			}
			while(curcol>startcol) {
				arr.add(matrix[row][curcol]);
				curcol--;
			}
			while(currow>startrow) {
				arr.add(matrix[currow][startcol]);
				currow--;
			}
		}
	}

}

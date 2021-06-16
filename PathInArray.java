/*
 * 判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
 * 路径可以从矩阵中的任意一个格子开始，每一步可以在矩阵中向左，向右，向上，向下移动一个格子。
 * 如果一条路径经过了矩阵中的某一个格子，则该路径不能再进入该格子。
 */
public class PathInArray {
	public boolean hasPath (char[][] matrix, String word) {
		if(matrix==null)
			return false;
		int row = matrix.length;
		int col = matrix[0].length;
		boolean[][] vis = new boolean [row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(dfs(matrix,i,j,vis,0,word))
					return true;
			}
		}
		return false;
		
	}
	
	public boolean dfs(char[][] matrix,int m,int n,boolean [][] vis,int k,String word) {
		if(m<0||n<0||m>=matrix.length||n>=matrix[0].length||vis[m][n]==true)
			return false;
		if((k==word.length()-1)&&(matrix[m][n]==word.charAt(k)))
			return true;
		if(matrix[m][n]==word.charAt(k)) {
			vis[m][n]=true;
			if(dfs(matrix, m+1, n, vis, k+1, word)||dfs(matrix, m-1, n, vis, k+1, word)||
					dfs(matrix, m, n+1, vis, k+1, word)||dfs(matrix, m, n-1, vis, k+1, word))
				return true;
		}
		vis[m][n]=false;
		return false;
	}

}

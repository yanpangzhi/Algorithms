/**
 * 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],
 * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。
 * 不能使用除法。（注意：规定B[0] = A[1] * A[2] * ... * A[n-1]，B[n-1] = A[0] * A[1] * ... * A[n-2];）
 * @author 12191
 *
 */
public class MultiplyArr {
	public int[] multiply(int[] A) {
		if(A == null||A.length==1) 
			return null;
		int len = A.length;
		int [] B = new int[len];
		for(int i =0;i<len;i++) {
			for(int j = 0;j<len;j++) {
				if(j==0)
					B[i]=1;
				if(i!=j)
					B[i]*=A[j];
			}
		}
		return B;	
	}
	
	//left[i+1] = left[i] * A[i] ;right[i] = right[i+1] * A[i+1]
	//B[i]=left[i]*right[i]
	public int[] multiply2(int[] A) {
		if(A == null||A.length==1) 
			return null;
		int len = A.length;
		int [] B = new int[len];
		B[0]=1;
		//先计算left[i]，存放在B[i]中
		for(int i =1;i<len;i++) {
			B[i]=B[i-1]*A[i-1];
		}
		int right = 1;
		for(int j = len-2;j>=0;j--){
			right *= A[j+1];
			B[j]*=right;
			}
		
		return B;
	}

}

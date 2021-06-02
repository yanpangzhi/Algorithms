//旋转数组的最小数字
import java.rmi.server.UID;
import java.util.*;
public class minNumberInRotateArray {
	public int minNumInArr1(int [] array) {
		if(array.length==0)
			return 0;
		for(int i=1;i<array.length;i++) {
			if(array[i]<array[i-1])
				return array[i];
		}
		return array[0];
	}
	public int minNumInArr2(int [] array) {
		if(array.length ==0)
			return 0;
		int lw =0;
		int hi = array.length-1;
		int mid = 0;
		while(lw<hi) {
			mid = (lw+hi)/2;
			if (array[mid]>array[hi])
				lw = mid+1;
			else if(array[mid]<array[hi])
				hi = mid; //arr[mid]可能是答案，所以不能是mid-1
			else {
				hi--;
			}
		}
		return array[lw];
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		minNumberInRotateArray test = new minNumberInRotateArray();
		int [] arr = {3,4,5,0,1,2};
		int minNum1 = test.minNumInArr1(arr);
		System.out.println(minNum1);
		int minNum2 = test.minNumInArr2(arr);
		System.out.println(minNum2);
	}

}

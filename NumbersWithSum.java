import java.util.ArrayList;

//输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
public class NumbersWithSum {
	public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum){
		ArrayList<Integer> res = new ArrayList<>();
		if(array==null)
			return res;
		int lw = 0;
		int hi = array.length-1;
		int cursum ;
		while(lw<=sum/2) {
			cursum = array[lw]+array[hi];
			if(cursum<sum)
				lw++;
			else if (cursum>sum)
				hi--;
			else {
				res.add(array[lw]);
				res.add(array[hi]);
				return res; //最外层乘积最小
			}
		}
		return res;
	}

}

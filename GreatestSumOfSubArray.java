//连续子数组的最大和
public class GreatestSumOfSubArray {
	public int FindGreatestSumOfSubArray(int[] array) {
		if(array==null)
			return 0;
		int curSum =array[0];
		int resSum =array[0];
		for(int i =1;i<array.length;i++) {
			curSum += array[i];
			resSum = Math.max(curSum, resSum);
			if (curSum<0)
				curSum =0;
		}
		return resSum;
	}
}

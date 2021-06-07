/*
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class ReOrderArray {
	public int[] reOrderArray (int[] array) {
		if(array ==null)
			return null;
		int len = array.length;
		int[] res = new int[len];
		int j =0;
		for(int i=0;i<len;i++) {
			if((array[i]&1)!=0)
				res[j++]=array[i];				
		}
		for(int i =0;i<len;i++) {
			if((array[i]&1)==0)
				res[j++]=array[i];
		}
		return res;
	}
}

/*
 * 把只包含质因子2、3和5的数称作丑数（Ugly Number）。
 * 例如6、8都是丑数，但14不是，因为它包含质因子7。 
 * 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 */
public class UglyNum {
	public int GetUglyNumber_Solution(int index) {
		if(index<=0)
			return 0;
		int ugly =  1;
		int[] uglyNum = new int[index];
		int cnt2 =0;
		int cnt3 =0;
		int cnt5 =0;
		uglyNum[0]=1;
		while(ugly<index) {
			int min = Math.min(uglyNum[cnt2]*2, Math.min(uglyNum[cnt3]*3,uglyNum[cnt5]*5));
			uglyNum[++ugly]=min;
			if(uglyNum[cnt2]*2==min) cnt2++;
			if(uglyNum[cnt3]*3==min) cnt3++;
			if(uglyNum[cnt5]*5==min) cnt5++;
		}
		return uglyNum[index-1];
	}
}

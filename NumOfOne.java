//输入一个整数，输出该数32位二进制表示中1的个数。其中负数用补码表示。
public class NumOfOne {
	public int NumberOf1(int n) {
		int cnt = 0;
		while(n!=0) {
			cnt++;
			n = n&(n-1);
		}
		return cnt;
	}

}

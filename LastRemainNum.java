//圆圈中最后剩下的数,从0~n-1，每次0数到m-1时，m-1的人出列，直到最后一个数
public class LastRemainNum {
	public int LastRemaining_Solution(int n, int m) {
		if(n<1||m<1)
			return -1;
		int index = 0;//n=1
		for(int i =2;i<=n;i++) {
			//f(n,m) = (m+x)%n,f(n-1,m)=x
			index = (index+m)%i;    
		}
		return index;
	}

}

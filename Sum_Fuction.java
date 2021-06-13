//求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）
public class Sum_Fuction {
	public int Sum_Solution(int n) {
		int sum = n;
		boolean flag = (sum>1)&&(sum += Sum_Solution(n-1))>0;
		return sum;
	}

}

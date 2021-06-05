//写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
public class AddFunction {
	public int Add(int num1,int num2) {
		int andsum = 0;
		int carry = 0;
		do{
			andsum = num1 ^ num2;
			carry = num1 & num2;
			num1 = andsum;
			num2 = carry<<1;
			
		}while(carry!=0);
		return andsum;
	}
	public static void main(String[] args) {
		AddFunction test = new AddFunction();
		int sum = test.Add(3, 5);
		System.out.print(sum);
		
	}
}


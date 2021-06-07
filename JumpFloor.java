//一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法
public class JumpFloor {
	public int JumpNum(int target) {
		if(target<=0)
				return 0;
		if(target<=2)
			return target;
		int f1 =1;
		int f2 =2;
		int n =2;
		int res = 0;
		while(n<target) {
			res = f1+f2;
			f1 = f2;
			f2 = res;	
			n++;
		}
		return res;
	}

}

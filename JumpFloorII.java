import javax.accessibility.AccessibleResourceBundle;

/**跳台阶扩展问题
 *一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 **/

public class JumpFloorII {
	//暴力法
	public int JumpFloor(int n) {
		if(n<0)
			return 0;
		if(n<=2)
			return n;
		int [] res = new int[n];
		res[0]=0;res[1]=1;
		for(int i =2;i<n;i++) {
			for(int j = 0;j<i;j++) {
				res[i]+=res[j];}
			res[i]++;
			}
		return res[n-1];
	}
	//规律
    public int JumpFloor2(int target) {
        if(target<=0)
            return 0;
        if(target <=2)
            return target;
       else
            return (int)Math.pow(2,target-1);
   }
	
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JumpFloorII test = new JumpFloorII();
		int num = test.JumpFloor2(4);
		System.out.println(num);

	}

}

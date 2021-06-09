//一个整型数组里除了两个数字只出现一次，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
public class AppearOnceNum {
	public int[] FindNumsAppearOnce (int[] array) {
		if(array==null ||array.length<2)
			return null;
		int[] res = new int[2];
		int t1=0;
		int t2=0;
		int tmp = 0;
		for(int i =0;i<array.length;i++){
			tmp ^= array[i];
		}
		int t = 1;
		while((tmp&t)==0) {
			t<<=1;
		}
		for(int i =0;i<array.length;i++) {
			if((array[i]&t)==0) {
				t1^=array[i];
			}
			else
				t2 ^=array[i];
		}
		if(t1<t2) {
			res[0]=t1;
			res[1]= t2;
		}
		else {
			res[0]= t2;
			res[1]= t1;
		}
		return res;
		
	}

}

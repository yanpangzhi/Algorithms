//第一个只出现一次的字符
public class FirstNotRepeatingChar {
	public int FirsChar(String str) {
		if(str==null ||str.length()==0)
			return -1;
		int len = str.length();
		int []arr = new int[256];
		for(int i=0;i<len;i++) {
				arr[str.charAt(i)]+=1;				
		}
		for(int i =0;i<len;i++) {
			if(arr[str.charAt(i)]==1)
				return i;
		}
		return -1;
	}
}

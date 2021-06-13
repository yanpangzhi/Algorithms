
//左旋转字符串
public class LeftRotateStr {
	public String LeftRotateString(String str,int n) {
		if(str ==null||str.length()<n)
			return "";
		int len = str.length();
		char[] arr = str.toCharArray();
		RotateString(arr,0,n-1);
		RotateString(arr,n,len-1);
		RotateString(arr,0,len-1);
		return String.valueOf(arr);
		
	}
	
	public char[] RotateString(char[] arr,int st,int end) {
		while(st<end) {
			char tmp = arr[st];
			arr[st] = arr[end];
			arr[end] = tmp;
			st++;
			end--;	
		}
		return arr;
	}
		
	public static void main(String[] args) {
		LeftRotateStr test = new LeftRotateStr();
		String str = "ASDFGH";
		String result = test.LeftRotateString(str, 4);
		System.out .println(result);
		
		}
	
}

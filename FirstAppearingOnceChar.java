import java.util.LinkedList;

//字符流中第一个不重复的字符,后台会用以下方式调用Insert 和 FirstAppearingOnce 函数
public class FirstAppearingOnceChar {
	char[] arr = new char[128];
	LinkedList <Character> str = new LinkedList<>();
	
	public void Insert(char ch) {
		arr[ch]++;
		str.add(ch);
	}
	
	public char FirstAppearingOnce() {
		while(str.size()!=0) {
			char c = str.peek().charValue();
			if(arr[c]==1){
				return c;
			}
			else
				str.remove();
			
		}
		return '#';
	}
	
}

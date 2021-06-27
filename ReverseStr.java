/*
 * 翻转单词序列
 * 输入："nowcoder. a am I"
 * 返回值："I am a nowcoder."
 */
import java.lang.StringBuffer;
public class ReverseStr {
	public String ReverseSentence(String str) {
		if(str==null ||str.length()==0)
			return str;
		StringBuffer sBuffer = new StringBuffer();
		String[] arr = str.split(" ");
		for(int j =arr.length-1;j>0;j--) {
			sBuffer.append(arr[j]);
			sBuffer.append(" ");
		}
		sBuffer.append(arr[0]);
		return sBuffer.toString();
	}

}

import java.util.*;

/*
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则按字典序打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 */
public class PermutationStr {
	public ArrayList<String> Permutation(String str) {
		ArrayList <String> ans = new ArrayList<>();
		if(str ==null ||str.length()==0)
			return ans;
		char[] arr = str.toCharArray();
		TreeSet<String> newstr = new TreeSet<>();
		Permutation(arr,0,newstr);
		ans.addAll(newstr);
		return ans;
	}
	
	public void Permutation(char[] arr, int pos,TreeSet<String> newstr) {
		if(pos+1== arr.length) {
			newstr.add(String.valueOf(arr));
			return;
			}		
		for(int j = pos;j<arr.length;j++) {
			swap(arr, pos, j);
			Permutation(arr,pos+1,newstr);
			swap(arr, pos, j);
		}
			
	}
	
	public void swap(char[] arr,int i,int j) {
		char tmp = arr[j];
		arr[j]= arr[i];
		arr[i]= tmp;
	}
}

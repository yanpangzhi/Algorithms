import java.lang.reflect.Array;

/*
 * 请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
 * 例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。
 *  但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。
 */
public class NumericStr {
	int index = 0;
	public boolean isNumeric (String str) {
		if(str==null||str.length()==0)
			return false;
		char[] arr = str.toCharArray();
		boolean numeric = scanInteger(arr);
		//小数点前面可以没有数字，小数点后可以没有数字
		if(index<arr.length&&arr[index]=='.') {
			index++;
			numeric = scanUnsignedInteger(arr)||numeric;
		}
		//e|E前后都需要有数字
		if(index<arr.length&&(arr[index]=='e'||arr[index]=='E')) {
			index++;
			numeric = numeric && scanInteger(arr);
		}
		
		return numeric&&(index == str.length());
	}
	public boolean scanInteger(char[] array) {
		if(index<array.length&&(array[index]=='+'||array[index]=='-'))
			index++;
		return scanUnsignedInteger(array);
	}
	public boolean scanUnsignedInteger(char[] array) {
		int begin = index;
		while(index<array.length&&array[index]>='0'&&array[index]<='9')
			index++;
		return index>begin;
	}
	

}

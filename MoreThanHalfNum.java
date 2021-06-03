//数组中出现次数超过一半的数字
import java.util.*;
public class MoreThanHalfNum {
	public int MoreThanHalfNum_Solution(int [] array) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		int len = array.length;
		for(int i =0;i<array.length;i++) {
			if(hm.keySet().contains(array[i]))
				hm.put(array[i],hm.get(array[i]) +1);
			else
				hm.put(array[i], 1);
		}
		for(int key :hm.keySet())
		{
			if(hm.get(key)>len/2)
				return key;
		}
		return 0;
		
	}

}

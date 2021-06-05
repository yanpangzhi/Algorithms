/*
 * 现在有2副扑克牌，从扑克牌中随机五张扑克牌，我们需要来判断一下是不是顺子。
有如下规则：
1. A为1，J为11，Q为12，K为13，A不能视为14
2. 大、小王为 0，0可以看作任意牌
3. 如果给出的五张牌能组成顺子（即这五张牌是连续的）就输出true，否则就输出false
 */
import java.util.Arrays;
public class ContinuousCards {
	public boolean isContinuous(int [] numbers)
	{
		if(numbers.length<5)
			return false;
		int cnt = 0;
		int need = 0;
		Arrays.sort(numbers);
		for(int i=0;i<numbers.length-1;i++) {
			if(numbers[i]==0) {
				cnt++;
				continue;
			}
			if(numbers[i]==numbers[i+1])
				return false;
			need+=numbers[i+1]-numbers[i]-1;
		}
		if(need <= cnt)
			return true;
		return false;
				
	}
}

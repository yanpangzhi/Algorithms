/*
 * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。
 *  数组中某些数字是重复的，但不知道有几个数字是重复的。
 *  也不知道每个数字重复几次。请找出数组中任一一个重复的数字。
 *  例如，如果输入长度为7的数组[2,3,1,0,2,5,3]，那么对应的输出是2或者3。存在不合法的输入的话输出-1
 */
public class Duplicate {
    public int duplicateNum (int[] numbers) {
        // write code here
        if(numbers==null || numbers.length<=1)
            return -1;
        int len = numbers.length;
        int[] arr = new int[len];
        for(int i =0;i<len;i++){
            if(arr[numbers[i]]==0)
                arr[numbers[i]]=1;
            else
                return numbers[i];
        }
        return -1;
        
    }

}

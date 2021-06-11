import java.util.ArrayList;
//找出所有和为S的连续正数序列
public class ContinuousSequence {
	public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum){
		ArrayList<ArrayList<Integer> > res = new ArrayList<>();
		int lw =1;
		int hi = 2;
		int cursum;
		while(lw<=sum/2) {
			cursum = (hi-lw+1)*(hi+lw)/2;
			if(cursum<sum) 
				hi++;
			else if(cursum>sum) 
				lw++;
			else {
				ArrayList<Integer> arr = new ArrayList<>();
				for(int i = lw;i<=hi;i++) {
					arr.add(i);
				}
				res.add(arr);
				lw++;
			}
		}

		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContinuousSequence test = new ContinuousSequence();
		ArrayList<ArrayList<Integer> > result = test.FindContinuousSequence(5);
		System.out.println(result);
		
	}

}

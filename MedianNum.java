//使用Insert()方法读取数据流，使用GetMedian()方法获取当前读取数据的中位数。

import java.util.PriorityQueue;
import java.util.Comparator;
public class MedianNum {
	int count =0;
	PriorityQueue<Integer> minHap  = new PriorityQueue<>();
	PriorityQueue< Integer> maxHap = new PriorityQueue<Integer>(new Comparator<Integer>() {
		@Override
		public int compare(Integer t1,Integer t2) {
			return t2-t1;
		}
	});
	
	 public void Insert(Integer num) {
		 if(count%2 ==0) {
			//个数为偶数的话，则先插入到大顶堆，然后将大顶堆中最大的数插入小顶堆中。
			 maxHap.offer(num);
			 int min = maxHap.poll();
			 minHap.offer(min);
		 }
		 else {
			//个数为奇数的话，则先插入到小顶堆，然后将小顶堆中最小的数插入大顶堆中
			 minHap.offer(num);
			 int max = minHap.poll();
			 maxHap.offer(max);
		 }
		 count++;
	 }
	 
	 public Double GetMedian() {
		 double median;
		 if(count%2==0)
			 median = (maxHap.peek()+minHap.peek())/2.0;
		 else
			 median = minHap.peek();
		 return median;
	 }
	 
}

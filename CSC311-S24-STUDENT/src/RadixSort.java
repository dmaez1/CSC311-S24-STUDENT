import java.util.Arrays;
public class RadixSort {

	public static void main(String[] args) {
		//Starting array 
		int[]arr= {0,9,2,9,3,7,8,1};
		int n=arr.length;
		
		//this array will store the output
		int[] output = new int[n];
		
		//this array will be used keep count
		int[] count = new int [10];
		Arrays.fill(count,0);
		
		//Store count of occurrences in count[]
		for(int i=0; i < n; i++) {
			
		//work out where each number shold be in array
			for (int i=1;i <10; i++) {
				count [i] +=count[i-1];
				
				//
				for (int i=0)
				
			}
		}

	}

}

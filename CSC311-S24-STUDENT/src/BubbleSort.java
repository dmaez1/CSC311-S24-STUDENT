import java.lang.reflect.Array;

public class BubbleSort {

	public static void main(String[] args) {
		int [] arr= {0,9,45,75,90,802,24,2,66};
		sort(arr);
	}
	
	
	public static void sort(int[] array) {
		boolean swapped = false;
		int loopCounter=0;
		
		do {
			swapped=false;
		for (int x= 0; x < array.length-1; x++){
			if(array[x]>array[x+1]) {
				swap(array, x , x+1);
				swapped=true;
				
			}
	
		loopCounter++;
		}
		}while(swapped);
}
	System.out.println ("Loop Counter: "+  loopCounter);
	}
	


	private static void swap(int[] array, int a, int b) {
		int tmp=array[a];
		array[a]= array[b];
		array[b]=tmp;
	}
	

	
}
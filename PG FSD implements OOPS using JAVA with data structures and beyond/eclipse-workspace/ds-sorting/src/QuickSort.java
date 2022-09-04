import java.util.Arrays;


public class QuickSort {
	
	public static void sort(int[] givenArray, int startIndex, int endIndex) {
		if(startIndex < endIndex) {
			int pivot = partition(givenArray, startIndex, endIndex);
			sort(givenArray, startIndex, pivot-1); // changing the value of the end index and start index
			sort(givenArray,pivot+1, endIndex);
		}
	}
	
	private static int partition(int[] givenArray, int startIndex, int endIndex) {
		int pivot = endIndex; // last element in the array
		int i = startIndex - 1; // negative value 
		for(int j = startIndex; j <= endIndex; j++) {
			if(givenArray[j] <= givenArray[pivot]) {
				//swapping 
				i++;
				int temp = givenArray[i];
				givenArray[i] = givenArray[j];
				givenArray[j] = temp;
			}
		}
		return i;
	}

	public static void main(String[] args) {

		int[] givenArray = {9,6,5,3,1,2,4,6,8};
		System.out.println("Before sort : "  + Arrays.toString(givenArray));
		
		sort(givenArray, 0, givenArray.length-1);
		System.out.println("After sort: " + Arrays.toString(givenArray));

	}

} 

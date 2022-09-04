import java.util.Arrays;

// it is much faster than the insertion sort
public class SelectionSort {
	// it start with the sort index and goes to the next index 
	public static void sort(int[] givenArray) {
		for (int startIndex = 0; startIndex < givenArray.length; startIndex++) {
			int minimumIndex = startIndex; // 0
			for(int nextIndex = startIndex+1; nextIndex<givenArray.length; nextIndex++) {
				if(givenArray[nextIndex] < givenArray[minimumIndex]) {
					minimumIndex = nextIndex;
				}
			}
			if(minimumIndex != startIndex) {
				// we are trying to swap between 2 elements in the array ex: 6 is < than 9 so swap it 
				int temp = givenArray[startIndex];
				givenArray[startIndex] = givenArray[minimumIndex];
				givenArray[minimumIndex] = temp;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] givenArray = {9,6,5,3,1,2,4,6,8};
		System.out.println("Before sort : "  + Arrays.toString(givenArray));
		
		sort(givenArray);
		System.out.println("After sort: " + Arrays.toString(givenArray));
	}
	
}

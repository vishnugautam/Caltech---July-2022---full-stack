
// linear searching means one after one
public class Searching {
	// the array has to be sorted in binary search 
	// binary serach is much faster than linear search because half of the array is eliminated 
	public static int binary(int[] givenArray, int searchValue) {
		int startIndex = 0;
		int endIndex = givenArray.length - 1;
		int middleIndex = (startIndex + endIndex) / 2;
		
		while(givenArray[middleIndex] != searchValue && startIndex <= endIndex) {
			if(searchValue < givenArray[middleIndex]) {
				endIndex = middleIndex - 1;
			} else {
				startIndex = middleIndex + 1;
			}
			middleIndex = (startIndex + endIndex) / 2;
		}
		if(givenArray[middleIndex] == searchValue) {
			System.out.println("The element was found at the index " + middleIndex);
			return middleIndex;
		} else {
			System.out.println("The element " + searchValue + "Was not found");
			return -1;
		}
		
	}

	public static int linear(int[] givenArray, int searchValue) {
		for(int i = 0; i <givenArray.length; i++) {
			if(givenArray[i] == searchValue) {
				System.out.println("The element was found in index" + i);
				return i; // returning the index 
			}
		}
		System.out.println("The element " + searchValue + "is not found");
		return -1;
	}
}

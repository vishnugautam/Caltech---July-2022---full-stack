import java.util.Arrays;


public class InsertionSort {
	
	public static void sort(int[] givenArray) {
		for(int i = 1; i <givenArray.length; i++) {
			int temp = givenArray[i], j = i;
			while(j > 0 && givenArray[j-1] > temp) {
				givenArray[j] = givenArray[j-1];
				j--;
			}
			givenArray[j] = temp;
		}
	}
	
	public static void main(String[] args) {
		
		String[] s = {"B", "A", "C", "E", "D"};
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));
		int[] givenArray = {9,6,5,3,1,2,4,6,8};
		System.out.println("Before sort : "  + Arrays.toString(givenArray));
		
		sort(givenArray);
		System.out.println("After sort: " + Arrays.toString(givenArray));

	}

}

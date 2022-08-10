package simplilearn.test;

public class TestArrays {

	public static void main(String[] args) {
		// Declare an array of type integer
		int[] array1 = {2,3,5,7,11,13,17,19};
		int[] array2;
		
		System.out.print("array1 is ");
		// println means printing one line below the other 
		// print means printing on the same line 
		printArray(array1);
		System.out.println();
		array2 = array1; // if you modify content of array2 it will also modify array1
		
		//modify array2
		array2[0]  = 0;
		array2[2]  = 2;
		array2[4]  = 4;
		array2[6]  = 6;
		
		//print array1
		System.out.print("array1 is ");
		printArray(array1);
	}

	private static void printArray(int[] array1) {
		
		for(int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
		
	}
}

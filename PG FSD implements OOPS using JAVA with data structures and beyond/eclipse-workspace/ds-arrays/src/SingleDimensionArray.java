
public class SingleDimensionArray {
	// declare an array 
	int[] arr;
	
	public void delete(int index) {
		try {
			// we use default value as min value
			// replace the value with the min value or default value so that location becomes vacant 
			arr[index] = Integer.MIN_VALUE;
			System.out.println("the value has been deleted");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("the value that is provided is not in the range of array!");
		}
	}
	
	public void search(int value) {
		for(int i = 0; i <arr.length; i++) {
			if(arr[i] == value) {
				System.out.println("value is found at the index" + i);
				// once you find the item please return the  control back to the caller
				// even without return it will function 
				//without return the function still prints the below line also
				return ;
			}
		}
		System.out.println( value + " is not found");
	}
	
	public void traverse() {
		try {
			for(int i = 0; i < arr.length; i++) {
				System.out.println(arr[i] + " ");
			}
		} catch(Exception e) {
			System.out.println("Array no longer exists");
		}
	}
	
	SingleDimensionArray(int size){
		// if we never create the object and mention the size it will give null pointer exception
		// array is created using new keyword 
		// always best to initialize some default value in the array
		arr = new int[size];
		
		// we initialise the array with min value in all the locations, which might be 5, or 10 and such so...
		// if we remove the for loop it will be stored with the value of 0 in all the positions 
		for(int i =0; i < arr.length; i++) {
			// initialize the default value
			arr[i] = Integer.MIN_VALUE;
		}
	}
	
	
	public void insert(int location, int value) {
		
		try {
			
			if( arr[location] == Integer.MIN_VALUE) {
				arr[location] = value;
				System.out.println("successfully inserted");
			} else {
				System.out.println("This call is already occupied");
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index to access the array");
		}
		
	}

}

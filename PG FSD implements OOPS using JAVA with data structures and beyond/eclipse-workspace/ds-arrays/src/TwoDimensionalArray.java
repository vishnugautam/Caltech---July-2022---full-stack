
public class TwoDimensionalArray {
	
	public void delete(int row, int col) {
		try {
		twoDim[row][col] = Integer.MIN_VALUE;
		System.out.println("The value is deleted successfully");
	} catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Invalid index of 2D array");
	}
	}
		
	
	public void accesscell(int row, int col) {
		System.out.println("\n Accessing Row# " + row + " " + "Col# " + col);
		try {
			System.out.println("Cell value is: " + twoDim[row][col]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index for 2D array");
		}
	}
	
	// declare two dimensional array
	int[][] twoDim = null;
	
	public TwoDimensionalArray(int row, int col) {
		// create an array
		this.twoDim = new int[row][col];
		
		//initialize an array
		// rows * cols = length, ex, 2 rows * 5 cols = 10 elements can be stored
		for(int i=0; i < twoDim.length; i++) {
			for (int j = 0; j<twoDim[i].length; j++) {
				// store a default value which is min value in each location
				twoDim[i][j] = Integer.MIN_VALUE;
			}
		}

	}
	
	public void traverse() {
		for(int i=0; i < twoDim.length; i++) {
			for (int j = 0; j<twoDim[i].length; j++) {
				System.out.println(twoDim[i][j] + " ");
				
			}
		}
		
	}
	
	public void search(int value) {
		for(int i=0; i < twoDim.length; i++) {
			for (int j = 0; j<twoDim[i].length; j++) {
				if(twoDim[i][j] == value) {
					System.out.println("The value is found at row: " + i + " col: " + j);
					return;
				} 
			
			}
			
		}
			System.out.println("Value is not found");
		
	}
	
	public void insert(int row, int col, int value) {
		try {
		if(twoDim[row][col] == Integer.MIN_VALUE) {
			twoDim[row][col] = value;
			System.out.println("Value is successfully inserted");
		} else {
			System.out.println("This call is already taken");
		}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index for two dimensional array");
		}
	}
}

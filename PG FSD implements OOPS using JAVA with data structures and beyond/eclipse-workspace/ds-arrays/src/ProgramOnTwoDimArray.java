
public class ProgramOnTwoDimArray {

	public static void main(String[] args) {
		// 3 rows and 3 cols
		TwoDimensionalArray tda = new TwoDimensionalArray(3,3);
		tda.traverse();
		tda.insert(0, 0, 1);
		tda.insert(0, 1, 2);
		tda.insert(0, 2, 3);
		tda.insert(2, 0, 4);
		tda.insert(2, 1, 5);
		tda.insert(2, 2, 0);
		tda.insert(1, 2, 6);
		tda.insert(1, 1, 4);
		tda.insert(1, 0, 8);
		tda.traverse();
		
		tda.accesscell(1, 0);
		tda.delete(1, 0);
		tda.traverse();
		tda.search(5);
		

	}

}

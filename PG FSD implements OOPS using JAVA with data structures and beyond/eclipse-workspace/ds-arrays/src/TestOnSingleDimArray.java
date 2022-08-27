

public class TestOnSingleDimArray {
	
	public static void main(String[] args) {
		SingleDimensionArray singleDimensionArray = new SingleDimensionArray(5);
		singleDimensionArray.insert(0,10);
		// after inserting 10 replaces the default value of -2147... in the location of 0
		singleDimensionArray.insert(3,30);
		singleDimensionArray.insert(4,20);
		singleDimensionArray.insert(1,20);
		singleDimensionArray.insert(2,50);
//		singleDimensionArray.insert(5,60); - index out of bound exception in catch block 
		singleDimensionArray.traverse();
		singleDimensionArray.search(20);
		singleDimensionArray.search(200);
		singleDimensionArray.delete(2);
		singleDimensionArray.traverse();
		
	}

}

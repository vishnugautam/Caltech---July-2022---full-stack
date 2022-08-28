
public class TestSinglyLinkedList {

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		
		list.createSinglyLinkedList(7);
//		list.createSinglyLinkedList(8); // the create method will create only one single node
		// it is not performing insert 
		list.traverse();
		
		list.insert(8, 1);
		list.insert(6, 0);
		list.insert(5, 0);
		list.insert(10, 2); // in between 6 and 7 we insert 10
		list.traverse();
		
		list.search(7);
		
		list.deleteNode(3); // this will delete 7 which is in the location 3
		list.traverse();

	}

}

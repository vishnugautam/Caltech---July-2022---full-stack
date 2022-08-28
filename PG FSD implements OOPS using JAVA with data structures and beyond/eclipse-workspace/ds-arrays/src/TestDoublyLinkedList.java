
public class TestDoublyLinkedList {

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.create(7);
		list.insert(6, 0);
		list.insert(8, 2);
		list.insert(9,3);
		list.traverse();
		list.reverse();
		list.search(8);

	}

}

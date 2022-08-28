// we cannot come reverse from the second node to the first 

public class SinglyLinkedList {

	// head will always point to the first node
	public Node head; // pointers in a list - first node 
	// tail will always point to the last node
	public Node tail; // pointers in a list - last node in the list
	public int size; // a variable 
	
	// to delete the whole list 
	public void delete() {
		head = null;
		tail = null;
		System.out.println("The singly linked list was deleted successfully");
	}
	
	public void deleteNode(int location) {
		if(head == null) {
			System.out.println("My SLL does not exist");
			return;
			// delete the first node
		} else if (location == 0) {
			head = head.next;
			size--;
			if(size == 0) {
				tail = null;
			}
			// delete the last node 
		} else if(location >= size) {
			Node tempNode = head;
			
			for(int i = 0; i < size -1; i++) {
				tempNode = tempNode.next;
			}
			
			if(tempNode == head) {
				tail = head = null;
				size--;
				return;
			}
			tempNode.next = null;
			tail = tempNode;
			size--;
			
		} else { // delete in the middle 
			Node tempNode = head;
			for(int i = 0; i < location - 1; i++) {
				tempNode = tempNode.next;
			}
			tempNode.next = tempNode.next.next;
			size--;
		}
	}
	
	
	
	public boolean search(int value) {
		if(head != null) {
			Node tempNode = head;
			
			for(int i = 0; i < size; i++) {
				if(tempNode.value == value) {
					System.out.println("I found the node at the loc " + i + "\n");
					return true;
				}
				tempNode = tempNode.next;
			}
		}
		System.out.println("Node not found");
		return false;
	}
	
	
	public void insert(int value, int loc) {
		Node node = new Node();
		node.value = value;
		if(head == null) {
			createSinglyLinkedList(value);
			return;
		} else if(loc == 0) { // insert a node in the beginning
			// next is the link - which is assigned to the first node
			node.next = head;
			// head which was the first node, now points to the new node which again becomes first 
			// so the new node becomes the first node
			head = node;
			
		} else if(loc >= size) { // at the end
			// the link is now pointed to the null which means the end node
			node.next = null; // change the link part to null
			// the last node becomes the new node 
			tail.next = node; // tail.next points to the new node
			tail = node; // tail becomes the next node, which is the new node
			
		} else { // insert a node in the middle of two nodes
			// tempNode is pointed to the head the first node
			Node tempNode = head;
			int index = 0;
			while(index < loc -1) {
				// we are moving the tempNode to the next link in each loop
				tempNode = tempNode.next;
				index++;
			}
			// nextNode is assigned to the link of tempNode
			Node nextNode = tempNode.next;
			// tempNode.next link is assigned to the new node
			tempNode.next = node;
			// new node's link is assigned to the nextNode 
			node.next = nextNode;
		}
		// after adding a node we are incrementing, if its in the beginning middle or the end
		size++;
	}
	
	public void traverse() {
		if(head == null) {
			System.out.println("SLL does not exist");
		} else {
			Node tempNode = head;
			for(int i = 0; i < size; i++) {
				System.out.println(tempNode.value);
				if(i!= size -1) {
					System.out.println(" -> ");
				}
				tempNode = tempNode.next; // link to the next node 
				// move from one link to another link 
			}
		}
		System.out.println("\n");
	}
	
	
	public Node createSinglyLinkedList(int value) {
//		head = new Node(); // we can also comment this line
		// initially to set head and tail to dummy node
//		// just to show that head and tail are a node 
//		tail = new Node();
		
		// create a new node
		Node node = new Node();
		node.value = value;
		node.next = null; // we have reached to the end of the node 
		
		head = node; // points to one single node
		tail = node; // points to one single node 
		size = 1;
		return head;
	}
	
}

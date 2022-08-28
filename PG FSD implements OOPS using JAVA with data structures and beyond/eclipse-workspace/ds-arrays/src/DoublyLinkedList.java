

public class DoublyLinkedList {
	
	public DoublyNode head;
	public DoublyNode tail;
	int size; // length of my linked list 
	
	public void deleteDLL() {
		DoublyNode tempNode = head;
		for(int i = 0; i < size; i++) {
			tempNode.previous = null;
			tempNode = tempNode.next;
			// assigning it to null, the garbage collector will collect it 
		}
		head = null;
		tail = null;
		System.out.println("The DLL has been deleted");
	}
	
	public void deleteNode(int loc) {
		if(head == null) {
			System.out.println("The DLL does not exist");
			// come out of this method
			return;
			
			//delete a node in the beginning
		} else if(loc == 0) {
			if(size == 1) {// if there is only one node
				head = null;
				tail = null;
				size--;
				return;
				// if size is not one
			} else {
				head = head.next; // move the head 
				head.previous = null;
				size--;
			}
			// if it is at the end of the list 
		} else if(loc >= size) {
			DoublyNode tempNode = tail.previous;
			if(size == 1) {// if there is only one node
				head = null;
				tail = null;
				size--;
				return;
				// if size is not one
			} else {
				tempNode.next = null;
				tail = tempNode;
				size--;
			}
			// in the middle 
		} else {
			DoublyNode tempNode = head;
			// find the location 
			for(int i = 0; i < loc -1; i++) {
				tempNode = tempNode.next;
			}
			// the previous and next nodes have to be connected 
			// next to next is connection the node before to the node after
			tempNode.next = tempNode.next.next;
			tempNode.next.previous = tempNode;
			size--;
		}
	}
	
	public boolean search(int value) {
		if(head != null) {
			// assigning tempNode to the first node 
			DoublyNode tempNode = head;
			for(int i = 0; i < size; i++) {
				if(tempNode.value == value) {
					System.out.println("The node is found at the loc: " + i);
					// come out of this method
					return true;
				}
				// if not the above is met, then, 
				// assigning the next node link to the tempNode 
				tempNode = tempNode.next; // and for loop continues
			}
		}
		System.out.println("Node not found");
		return false;
	}
	
	
	public void insert(int value, int loc) {
		DoublyNode node = new DoublyNode();
		node.value = value;
		
		if(head == null) {
			create(value);
			// come out of this method
			return;
			
			// insert node at the beginning - we are using the head 
		} else if(loc == 0) {
			node.next = head;
			node.previous = null;
			// head.previous was null and now remove the null and add the value
			head.previous = node;
			// head pointing to the old node and take it and paste it to the first new node 
			head = node; // node created in line 11
			
			// insert at the end - we are using the tail
		} else if(loc >= size) {
			node.next = null;
			tail.next = node;
			node.previous = tail;
			tail = node;
		} else {
			// tempNode is assigned to the starting node
			DoublyNode tempNode = head;
			int index = 0;
			// where actually i want to insert my node
			while(index < loc - 1) {
				// tempNode is assigned the next link, the next node 
				tempNode = tempNode.next;
				index++;
			}
			// all the variables in tempNode is assigned to node.previous
			node.previous = tempNode;
			node.next = tempNode.next;
			// tempNode.next, the link,  is assigned to the new node 
			tempNode.next = node;
			node.next.previous = node;
		}
		
		size++;
		
	}
	
	
	public void reverse() {
		if(head != null) {
			// assigning tempNode to the last node 
			DoublyNode tempNode = tail;
			for(int i = 0; i <size; i++) {
				System.out.print(tempNode.value);
				
				// for readability purpose 
				if(i != size - 1) {
					System.out.print(" <- ");
				}
				// it goes in the reverse order the previous link 
				tempNode = tempNode.previous;
			}
		} else {
			System.out.println("the DLL does not exist");
		}
		System.out.println("\n");
	}
	
	
	public void traverse() {
		if(head != null) {
			// assigning tempNode to the head which is the first node
			DoublyNode tempNode = head;
			for(int i = 0; i < size; i++) {
				System.out.print(tempNode.value);
				// for readability purpose 
				if(i != size - 1) {
					System.out.print(" -> ");
				}
				tempNode = tempNode.next;
			}
		} else {
			System.out.println("The DLL does not exist");
		}
		System.out.println("\n");
	}
	
	
	public DoublyNode create(int value) {
//		head = new DoublyNode();
		
		
		DoublyNode node = new DoublyNode();
		node.next = null;
		node.previous = null;
		node.value = value;
		
		head = node;
		tail = node;
		size = 1;
		
		return head; // i am returning the first node in the doubly list
	}
	
}

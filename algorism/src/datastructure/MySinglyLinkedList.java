package datastructure;


public class MySinglyLinkedList<E> {
	
	private class Node {
		Object data;
		Node next;
		
		// 처음 LinkedList를 만들때 쓰일 생성자 
		public Node(Object data) {
			this.data = data;
			this.next = null;
		}
		
	}
	private int size;
	private Node head;
	
	//LinkedList의 생성자
	//처음 LinckedList를 만든다면 head는 비어 있다.
	public MySinglyLinkedList() {
		head = null;
		size = 0;
	}
	
	public boolean add(E element) {
		// 첫번 째 노드이면,
		if(head == null) {
			head = new Node(element);
		} else {
		// 첫번째 노드부터 탐색
		Node node = head;
		// 헤더의 다음 노드를 탐색하는데, 다음 노드가 null이 아닐 떄 까지 탐색한다.
		for( ; node.next != null; node = node.next) {
			
		}
		// 탐색을 다했으면 node 객체가 마지막 노드를 가지고 있게 된다.
		node.next = new Node(element);
		}
		
		
		size++;
		
		return true;
	}
	// 몇번째 노드를 가져오고 싶은지
	public E get(int index) { 
		 if(index < 0 || size <=index)
			 throw new IndexOutOfBoundsException();
		 
		 Node node = getNode(index);
		 return (E) node.data;
	}
	
	public Node getNode(int index) {
		Node node = head;
		
		 // index 까지 node를 움직인다.
		 for(int i=0; i<index; i++) {
			 node = node.next;
		 }
		 
		 return node;
	}
	
	// n번째 있는 노드의 값 수정하고
	// 원래 들어있던 값 리턴하기
	public E set(int index,E element ) {
		//get() 호출하기
		E old = get(index);
		// get이랑 코드가 대부분 겹치넹.. 일단하자..
		// 커서를 head에 맞춘다.
		Node node = head;
		// index까지 node를 움직인다.
		for(int i=0; i<index; i++) {
			node= node.next;
		}
		// node
		node.data = element;
		
		return old;
	}
	// 해당 요소가 몇번 째 노드에 있는지?
	public int indexOf(E element) {
		Node node = head;
		int cnt =0;
		for(; node.next != null; node=node.next) {
			if(node.data.equals(element)) {
				return cnt;
			}
			cnt++;
		}
		return -1;
	}
	
	//해당 index의 요소 삭제 중요!
	public E remove(int index) {
		E element = get(index);

		Node preNode = getNode(index - 1);

		// 첫번째 노드이면?
		if (index == 0) {
			head = new Node(head.next);
		} else {
			preNode.next = preNode.next.next;
		}

		size--;
		return element;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[ ");
		Node node = head;
		for(; node != null; node=node.next) {
			
			sb.append(node.data);
			if(node.next != null)
				sb.append("->");
		}
		sb.append(" ]");
		return sb.toString();
	}
}

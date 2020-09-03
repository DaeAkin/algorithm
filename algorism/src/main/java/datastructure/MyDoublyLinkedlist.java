package datastructure;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//일단 단방향 링크드 리스트 연습으로 만들어 보겠음.
public class MyDoublyLinkedlist<E> implements List<E> {

	class Node {
		Object data;
		Node next;
		Node prev;
		
		public Node(Object data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return this.data.toString();
		}
		
	}
	private int size;
	Node head;
	Node tail;
	
	public MyDoublyLinkedlist() {
		size = 0;
		head = null;
		tail = null;
	}
	
	@Override
	public boolean add(E element) {
		// 처음 노드이면
		if(head == null) {
			Node node = new Node(element);
			head = node;
			tail = node;
		} else {
			// 처음노드가 아니면
				
			Node temp = new Node(element);
			tail.next = temp;
			temp.prev = tail;
			temp.next = null ;
			tail = temp;
//			temp.prev = tail;
//			tail = temp.next;
			 
			
		}
		
		size++;
		return true;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
	@Override
	public E get(int index) {
		// 찾으려고자 하는 index가 범위가 맞지 않으면 예외 던지기
		if(index < 0 || index >= size) 
			throw new IndexOutOfBoundsException(String.valueOf(index));
	
		return (E)getNode(index).data;
	}
	
	public Node getNode(int index) {
		// 반으로 잘랐을 때, index가 중간값을 넘으면 뒤에서부터 탐색
		if (index > size / 2) {
			Node node = tail;
			
			for (int i = size; i > index+1; i--) {
				node = node.prev;
				System.out.println(node.toString());
			}
			return node;
		} else {
			Node node = head;
			for (int i = 0; i < index; i++) {
				node = node.next;
			}
			return node;
		}
	}

	@Override
	public E set(int index, E element) {
		E old = get(index);
		
		Node node = getNode(index);
		node.data = element;
		return old;
	}


	@Override
	public E remove(int index) {
		E old = get(index);
		System.out.println(size +" : " + index );
		//만약 중간에 노드를 삭제했다면 
		// 삭제할 노드의 next와 삭제할 노드의 prev를 이어줘야함.
		if(index ==0) {
			head = head.next;
			head.prev = null;
		} else if (index+1== size) {
			
			Node node = getNode(index-1);
			node.next = null;
			tail = node;
		} 
		else {
			
			Node node = getNode(index-1);
			node.next = node.next.next;
			
			node.next.next.prev = node;
		}
		
		size--;
		return old;
	}

	@Override
	public int indexOf(Object object) {
		int i =0;
		Node node = head;
		for(; node.next != null; node = node.next) {
			if(node.data.equals(object)){
			 return i;
			 
			}
			i++;
		}
		return -1;
	}
	
	@Override
	public String toString() {
	
			StringBuilder sb = new StringBuilder();
			sb.append("[");
			Node node = head;
//			System.out.println(node.toString());
			for(; node!= null; node=node.next) {
//				System.out.println("???");
				sb.append(node.toString());
				if(node.next != null)
					sb.append("->");
			}
			sb.append("]");
			return sb.toString();
		
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void add(int index, E element) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<E> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}
}

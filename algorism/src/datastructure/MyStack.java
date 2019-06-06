package datastructure;

import java.util.ArrayList;
import java.util.List;

public class MyStack<E>{
	
	/*
	 * public void push(Element data);//순차보관
	 * 
	 * public Element pop();//가장 최근에 보관한 값 꺼내고 반환
	 * 
	 * public Element peek();//가장 최근에 보관한 값 단순 참조, 꺼내지 않음
	 * 
	 * public boolean empty(); //비어있는지 판별
	 * 
	 * public int search(Element data); //data를 보관한 순번 반환(1부터 시작)


	 */
	List<E> list;
	
	public MyStack() {
		 list = new ArrayList<>();
	}
	
	public void push(E element) {
		list.add(element);
	}
	
	public E pop() {
		E value = list.get(list.size()-1); 
		list.remove(list.size()-1);
		return value;
	}
	
	public E peek() {
		return list.get(list.size()-1);
	}
	
	public boolean empty() {
		return list.isEmpty();
	}
	
	public int search(E element) {
		if(list.contains(element)) {
			return list.indexOf(element)+1;
		} else {
			return -1;
		}
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < list.size(); i++) {
			sb.append(list.get(i) + " ");
		}
		sb.append("]");
		return sb.toString();
	}
	
	
	
	
	
	
}

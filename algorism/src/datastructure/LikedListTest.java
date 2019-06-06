package datastructure;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;

public class LikedListTest {


	@Test
	public void myDoublyLinkedList() {
		List<Integer> list = new MyDoublyLinkedlist<>();
		
		list.add(5);
		list.add(3);
		list.add(1);
		list.add(4);
		list.add(9);
		System.out.println(list.toString());
		
		assertThat(list.size(), is(5));
		assertThat(list.get(2), is(1));
		assertThat(list.get(4), is(9));
		assertThat(list.indexOf(0), is(-1));
		assertThat(list.indexOf(4), is(3));
		assertThat(list.remove(1), is(3));
		assertThat(list.size(), is(4));
		list.set(0, 10);
		assertThat(list.get(0), is(10));
		assertThat(list.remove(0), is(10));
		assertThat(list.size(), is(3));
		System.out.println("5랑 3이랑 제거됨.");
		System.out.println(list.toString());
		System.out.println(list.get(1));
		assertThat(list.remove(2), is(9));
		
	}
}

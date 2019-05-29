package datastructure;

public class LikedListTest {

	public static void main(String[] args) {
		
		MySinglyLinkedList<Integer> list = new MySinglyLinkedList<>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		
		list.remove(1);
		
		
		
		System.out.println(list.toString());
	}
}

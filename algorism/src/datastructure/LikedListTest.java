package datastructure;

public class LikedListTest {

	public static void main(String[] args) {
		
		MySinglyLinkedList<Integer> list = new MySinglyLinkedList<>();
		list.add(5);
		list.add(3);
		list.add(1);
		list.add(4);
		list.add(9);
		System.out.println("현재 노드 :" + list.toString());
		System.out.println("3번째 값 가져오기 ! : " + list.get(2));
		System.out.println("0이 있는지 확인 ! : " + list.indexOf(0));
		System.out.println("4은 어디있나요?! : " + list.indexOf(4) + "째 방에 있음!");
		System.out.println("2번 째 요소 삭제하기 ! : " +list.remove(1));
		System.out.println("현재 노드 :" + list.toString());
		System.out.println("첫번 째 요소를 10으로 변경! ");
		list.set(10, 0);
		System.out.println("현재 노드 :" + list.toString());
		
	}
}

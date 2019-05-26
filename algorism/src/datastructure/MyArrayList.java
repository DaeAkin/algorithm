package datastructure;

import java.util.List;

public class MyArrayList<E>{
	// 배열의 크기
	private int size;
	// 배열
	private E[] array;
	
	public MyArrayList() {
		 size = 0;
		 array = (E[]) new Object[10];
	}
	
	public boolean add(E element) {
		// 배열의크기가 size보다 커지면 배열을 2배로 늘려준다.
		if(size >= array.length) {
			// 원래 배열의 길이 X 2 만큼 새로운 배열을 생성한 후
			E[] bigger = (E[]) new Object[array.length * 2];
			// 원래 데이터를 새로만든 배열에 복사를 해준다 .
			System.arraycopy(array, 0, bigger, 0, array.length);
			//array 에게 bigger를 할당
			array = bigger;
		}
		array[size] = element;
		size++;
		// 항상 True를 반환하는 이유는 ? 
		return true;
	}
	
	// ArrayList에 접근하기
	public E get(int index) {
		// 찾으려는 요소의 index가 0보다 적거나, 배열을 넘으면 예외를 던진다.
		if(index<0 || index>=size) {
			throw new IndexOutOfBoundsException();
		}
		return array[index];
	}
	
	//해당 요소의 ArrayList의 값을 변경하고 원래 있던 값을 return 하기.
	public E set(int index,E element) {
		// 유효한 index인지 확인하기 위해서 만들어뒀던 get() 함수를 호출해주자.
		// 바뀐 요소를 리턴해주기 위해서도 get()을 사용했다.
		E old = get(index);
		array[index] = element;
		return old;
	}
	
	// 타입이 E가 아닌 Object를 넣은 이유는?
	// 해당 element가 배열에 존재하는지
	public int indexOf(Object element) {
		for(int i=0; i<size; i++) {
			if(element.equals(array[i]))
				return i;
		}
		return -1;
	}
	
	// 
	public E remove(int index) {
		//여기서 또한 유효한 index인지 확인하기 위해 get()함수를 호출해주자.
		// 삭제된 요소를 리턴해주기 위해서도 get()을 사용했다.
		E removed = get(index);
		for(int i = index; i<size-1; i++) {
			// 요소들을 한칸씩 땡겨주기.
			array[i] = array[i+1];
		}
		//배열 크기 1 감소
		size--;
		return removed;
	}
	
	@Override
	public String toString() {
		//StringBuffer 와 StringBuilder 와 new String 와 String = ""의 차이점? 
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(int i=0; i<size; i++) {
			sb.append(array[i]);
			//마지막 요소에는 콤마(,)를 제외해준다.
			if(i != size-1)
			sb.append(",");
		}
		sb.append("]");
		
		return sb.toString();
	}
	
	
	
	
}

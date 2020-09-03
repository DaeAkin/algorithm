package datastructure;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class MyStackTest {
	
	@Test
	public void myStackTest() {
		MyStack<Integer> stack = new MyStack<>();
		
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		System.out.println(stack.toString());
		assertThat(stack.peek(), is(5));
		assertThat(stack.pop(), is(5));
		System.out.println("peek : " + stack.toString());
		assertThat(stack.search(1), is(1));
		assertThat(stack.empty(), is(false));
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println("pop 3번 :" + stack.toString());
		stack.pop();
		assertThat(stack.empty(), is(true));
		
		
	}

}

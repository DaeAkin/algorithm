package datastructure;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;

public class MyTree {
	class Node {
		int value;
		Node left;
		Node right;
		
		public Node(int value) {
			this.value = value;
			this.left = null;
			this.right = null;
		}
		
	}

	Node root;
	
	public MyTree() {
		root = null;
	}
	
	
	public void add(int value) {
		root = addRecursive(root, value);
	}
	
	public Node addRecursive(Node currentNode, int value) {
		if(currentNode == null) {
			return new Node(value);
		}
		//왼쪽으로 이동
		if(currentNode.value > value) {
			currentNode.left = addRecursive(currentNode.left, value);

			//오른쪽으로 이동 
		} else if (currentNode.value <value) {
			currentNode.right = addRecursive(currentNode.right,value);
	
		} 
		// 값이 존재
			return currentNode;
		
	}
	
	public boolean contains(int value) {
		return containsRecursive(root, value);
	}
	
	public boolean containsRecursive(Node currentNode, int value) {
		if(currentNode == null) {
			return false;
		} 
		
		if(currentNode.value == value) {
			return true;
		}
		
		return currentNode.value > value ? 
				containsRecursive(currentNode.left, value) : 
						containsRecursive(currentNode.right, value);
	}
	
	public void remove(int value) {
		root = removeRecursive(root, value);
		System.out.println(value);
		System.out.println(contains(value));
	}
	
	public Node removeRecursive(Node currentNode, int value) {
		// 찾는 값이 없으면 null을 반환
		if(currentNode == null) {
			return null;
		}
		
		
		// 찾는 값이 존재
		System.out.println("currentNode.value :" + currentNode.value + " // value : " + value);
		if(currentNode.value == value) {

			// 자식 노드들이 하나도 없으면
			if(currentNode.right == null && currentNode.left == null) {
				return null;
			} 
			//자식노드가 하나만 있으면 
			if(currentNode.right == null) {
//				currentNode = currentNode.left;
				return currentNode.left;
			}
			//자식노드가 하나만 있으면
			if(currentNode.left == null) {
//				currentNode = currentNode.right;
				return currentNode.right;
			}
			
			//자식노드가 두개 있으면
			int smallestValue = findSmallestValue(currentNode);
			currentNode.value = smallestValue;
			currentNode.right = removeRecursive(currentNode.right, smallestValue);
			
			
			return currentNode;
		}
	    if (value < currentNode.value) {
	    	
            currentNode.left = removeRecursive(currentNode.left, value);
            return currentNode;
        }

        currentNode.right = removeRecursive(currentNode.right, value);
        return currentNode;
		
	}
	public int findSmallestValue(Node root) {
		return root.left == null ? root.value : findSmallestValue(root.left);
	}
	//깊이 우선 탐색
	public void dfs() {
		dfsR(root);
	}
	
	public void dfsR(Node node) {
		
//		System.out.println("node : " + node);
		if(node != null) {
			System.out.print(node.value + " ");
			dfsR(node.left);
			dfsR(node.right);
		}

	}
	
	//너비 우선 탐색! 
	 public void bfs() {
		 
		  if (root == null) {
		        return;
		    }
		 
		    Queue<Node> nodes = new LinkedList<>();
		    nodes.add(root);
		 
		    while (!nodes.isEmpty()) {
		 
		        Node node = nodes.remove();
		 
		        System.out.print(" " + node.value);
		 
		        if (node.left != null) {
		            nodes.add(node.left);
		        }
		 
		        if (node.right!= null) {
		            nodes.add(node.right);
		        }
		    }
	 }
	
	@Test
	public void TreeTest() {
		MyTree tree = new MyTree();
		tree.add(100);
		tree.add(50);
		tree.add(200);
		tree.add(25);
		tree.add(70);
		tree.add(12);
		tree.add(35);
		tree.add(60);
		tree.add(90);
		
		
		tree.dfs();
		tree.bfs();
		assertTrue(tree.contains(25));
		
		tree.remove(25);
		assertFalse(tree.contains(25));
	}
}
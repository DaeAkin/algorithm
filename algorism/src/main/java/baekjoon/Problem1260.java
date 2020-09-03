package baekjoon;

import java.beans.Visibility;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Problem1260 {
	
	static class Graph {
		class Node {
			int data;
			LinkedList<Node> adjacent;
			boolean marked;
			
			public Node(int data) {
				this.data = data;
				this.marked = false;
				adjacent = new LinkedList<>();
				
			} 
		}
		
		Node[] nodes;
		public Graph(int value[][]) {
			// 
			int size = value.length;
			System.out.println("사이즈 :" + size);
			nodes = new Node[size];
			for(int i=0; i<size; i++) {
				nodes[i] = new Node(i);
			}
			// 간선 이어주기 .
			for(int i=0; i<size; i++) {
				addEdge(value[i][0], value[i][1]);
			}
			
		}
		
		private void addEdge(int i1, int i2) {
			Node n1 = nodes[i1];
			Node n2 = nodes[i2];
			System.out.println(n1);
			System.out.println(n2);
			if(!n1.adjacent.contains(n2)) {
				n1.adjacent.add(n2);
			}
			if(!n2.adjacent.contains(n1)) {
				n2.adjacent.add(n1);
			}
			
		}
		//dfs로탐색 
		void dfs(int index) {
			Node root = nodes[index];
			Stack<Node> stack = new Stack<>();
			// 기준이 되는 노드를 스택에 넣어준다.
			stack.push(root);
			root.marked = true;
			while(!stack.isEmpty()) {
				Node r = stack.pop();
				for(Node n : r.adjacent) {
					if(n.marked == false) {
						n.marked = true;
						stack.push(n);
					}
				}
				visit(r);
			}
			
		}
		
		void visit(Node n) {
			System.out.print(n.data + " ");
		}
		
	}
	
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//정점의 개수 , 간선의 개수 , 탐색을 시작할 정점의 번호
		String firstLine = br.readLine();
		String firsts[] = firstLine.split(" ");
		// 정점의 개수 
		int N = Integer.parseInt(firsts[0]);
		// 간선의 개수 edge
		int M = Integer.parseInt(firsts[1]);
		// 탐색을 시작할 정점의 번호
		int V = Integer.parseInt(firsts[2]);
		
		System.out.println("정점의 개수 :" + N);
		System.out.println("간선의 개수 :" + M);
		System.out.println("탐색을 시작할 번호 :" + V);
		
		int[][] VN = new int[M][2];
		//간선의 개수만큼 돌린다.
		for(int i=0; i<M; i++) {
			//4 6
			//1 3
			String[] splits = br.readLine().split(" ");
			VN[i][0]=Integer.parseInt(splits[0]);
			VN[i][1]=Integer.parseInt(splits[1]);
		}
		
		Graph g = new Graph(VN);
		g.dfs(V);
		
	
	}
	


}

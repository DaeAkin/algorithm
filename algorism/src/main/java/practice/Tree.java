package practice;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {

    static class Node {

        int value;
        Node left;
        Node right;

        public Node(int value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public Node(int value) {
            this.value = value;
        }
    }
    Node head;


    public Tree(Node head) {
        this.head = head;
    }

    public void dfs() {
        dfsR(head);
    }

    public void bfs() {
        Queue<Node> queue = new LinkedList();

        queue.add(head);

        while(!queue.isEmpty()) {
            Node node = queue.poll();

            if(node.left != null)
                queue.add(node.left);

            if(node.right != null)
                queue.add(node.right);

            System.out.println(node.value);
        }

    }

    private void bfsR(Node node) {



        bfsR(node.right);
    }

    private void dfsR(Node node) {
        if(node != null) {
            System.out.println(node.value);
            dfsR(node.left);
            dfsR(node.right);
        }
    }

}

package practice;

public class TreeMain {

    public static void main(String[] args) {
        //                  5
//                        /\   \
        //              9       15
        //           1   7
        Tree.Node head = new Tree.Node(5,
                new Tree.Node(9, new Tree.Node(1),
                        new Tree.Node(7)), new Tree.Node(15));

        Tree tree = new Tree(head);

        tree.bfs();
    }
}

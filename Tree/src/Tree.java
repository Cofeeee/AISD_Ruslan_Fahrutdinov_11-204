import java.util.LinkedList;
import java.util.Queue;


public class Tree {
    public static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }
    Node root;

    public Tree() {
        root = null;
    }

    public void passageWide() {
        if (root == null) {
            return;
        }

        Queue<Node> que = new LinkedList<>();
        que.add(root);

        while (!que.isEmpty()) {
            Node tree = que.poll();
            
            System.out.print(tree.value + " ");
            
            if (tree.left != null) {
                que.add(tree.left);
            }
            
            if (tree.right != null) {
                que.add(tree.right);
            }
        }
    }
}

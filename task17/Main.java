import java.util.*;

public class Main {

    public static Tree<Integer> createTree() {
        /**
         * This tree should look like this:
         *
         *               8
         *             /  \
         *            3   10
         *           / \    \
         *          1   6    14
         *             / \   /
         *            4   7 13
         */
        Tree<Integer> tree = new Tree<>();
        int[] elementsInTree = new int[] {8, 10, 14, 13, 3, 1, 6, 4, 7};
        for (int elem : elementsInTree) {
            tree.insert(elem);
        }
        return tree;
    }

    public static List<Integer> breadthFirstTraversal(Tree<Integer> t) {
        List<Integer> res = new LinkedList<>();
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        queue.add(t.root);
    
        while (!queue.isEmpty()) {
    }

    public static int minDepth(Tree<Integer> t) {
    }


    public static void main(String[] args) {
        Tree<Integer> tree = createTree();
        System.out.println("In-order traversal: ");
        System.out.println(tree);

        System.out.println("Breadth First Search Output");
        List<Integer> levelOrderTraversed = breadthFirstTraversal(tree);
        for (int el : levelOrderTraversed) {
            System.out.println(el);
        }

        System.out.println("Min Depth");
        System.out.println(minDepth(tree));
    }
}

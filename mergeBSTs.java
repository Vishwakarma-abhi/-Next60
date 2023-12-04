import java.util.*;

public class mergeBSTs extends BST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Time = O(m+n) Space - O(m+n)
        // create two BSTs
        Node root1 = null;
        Node root2 = null;

        for (int i = 1; i < 9; i++) {
            root1 = Insert(root1, i);
        }
        for (int i = 10; i < 19; i++) { 
            root2 = Insert(root2, i);
        }

        // Now we first find the inorder of both the BSts
        ArrayList<Integer> bst1 = new ArrayList<>();
        ArrayList<Integer> bst2 = new ArrayList<>();

        inorderTraversal(root1, bst1);
        inorderTraversal(root2, bst2);

        // Now we will merge both the bst1 and bst2 elements
        // call the merge function
        ArrayList<Integer> mergeList = new ArrayList<>();
        merge(bst1, bst2, mergeList);
        Node newNode = null;
        // now lets build the Combined BSTree
        newNode = build(mergeList, 0, mergeList.size() - 1);
        printBST(newNode);

    }

    private static Node build(ArrayList<Integer> mergeList, int start, int end) {
        if (start > end)
            return null;

        int mid = (start + end) / 2;
        Node newNode = new Node(mergeList.get(mid));
        newNode.left = build(mergeList, start, mid - 1);
        newNode.right = build(mergeList, mid + 1, end);
        return newNode;
    }

    private static void merge(ArrayList<Integer> bst1, ArrayList<Integer> bst2, ArrayList<Integer> mergeList) {

        if (bst1 == null || bst2 == null) {
            return;
        }

        int i = 0, j = 0;
        while (i < bst1.size() || j < bst2.size()) {

            // compare the values
            if (bst1.get(i) < bst2.get(j)) {
                // add bst1 element
                mergeList.add(bst1.get(i));
                i++;
            } else {
                mergeList.add(bst2.get(j));
                j++;
            }

        }
        while (i < bst1.size()) {
            mergeList.add(bst1.get(i));
            i++;
        }
        while (j < bst2.size()) {
            mergeList.add(bst2.get(j));
            j++;
        }

    }

    private static void inorderTraversal(Node root, ArrayList<Integer> bst) {

        if (root == null)
            return;

        inorderTraversal(root.left, bst);
        bst.add(root.data);
        inorderTraversal(root.right, bst);

    }
}

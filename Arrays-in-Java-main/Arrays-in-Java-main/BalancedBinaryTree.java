import java.util.Scanner;

class TreeNode {
    int value;
    TreeNode left, right;

    TreeNode(int item) {
        value = item;
        left = right = null;
    }
}

public class BalancedBinaryTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        TreeNode root = buildBalancedTree(1, n);
        System.out.println("Balanced Binary Tree created with root value: " + root.value);
        sc.close();
    }

    private static TreeNode buildBalancedTree(int start, int end) {
        if (start > end) return null;
        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(mid);
        node.left = buildBalancedTree(start, mid - 1);
        node.right = buildBalancedTree(mid + 1, end);
        return node;
    }
}
import java.util.ArrayList;
import java.util.List;
import javax.swing.tree.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class _257 {
    List<String> list;

    private void helper(TreeNode root, String path) {
        if (root == null)
            return;

        path += root.val;

        if (root.left == null && root.right == null) {
            list.add(path);
            return;
        }
        helper(root.left, path + "->");
        helper(root.right, path + "->");
    }

    public List<String> binaryTreePaths(TreeNode root) {

        list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        helper(root, "");
        return list;
    }
}
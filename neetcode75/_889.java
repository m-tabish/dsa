import java.util.HashMap;
import javax.swing.tree.TreeNode;

class Solution {
    int preindex = 0;
    int postindex = 0;
    HashMap<Integer, Integer> map = new HashMap<>();

    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {

        for (int i = 0; i < postorder.length; i++) {
            map.put(postorder[i], i);
        }
        TreeNode root = dfs(preorder, postorder, 0, postorder.length - 1);
        return root;
    }

    private TreeNode dfs(int[] preorder, int[] postorder, int start, int end) {

        if (start > end || preindex >= preorder.length)
            return null;


        TreeNode root = new TreeNode(preorder[preindex++]);
        if (start == end)
            return root;

        int leftrootVal = preorder[preindex];

        int mid = map.get(leftrootVal);



        root.left = dfs(preorder, postorder, start, mid);
        root.right = dfs(preorder, postorder, mid + 1, end - 1);
        return root;
    }
}

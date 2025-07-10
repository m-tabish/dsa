import java.util.LinkedList;
import java.util.Queue;
import javax.swing.tree.TreeNode;

public class _623 {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {

        if (depth == 1) {
            TreeNode res = new TreeNode(val);
            res.left = root;
            return res;
        }

        Queue<TreeNode> q = new LinkedList<>();
        depth--;
        q.add(root);
        while (!q.isEmpty()) {
            int level = q.size();
            if (depth == 0)
                break;


            for (int i = 0; i < level; i++) {

                TreeNode node = q.poll();
                if (depth == 1) {

                    TreeNode tl = node.left;
                    TreeNode tr = node.right;

                    node.left = new TreeNode(val);
                    node.right = new TreeNode(val);
                    node.left.left = tl;
                    node.right.right = tr;

                } else {
                    if (node.left != null)
                        q.offer(node.left);
                    if (node.right != null)
                        q.offer(node.right);
                }
            }

            depth--;

        }

        return root;

    }
}

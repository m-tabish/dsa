import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import javax.swing.tree.TreeNode;

class _637 {

    public List<Double> averageOfLevels(TreeNode root) {

        List<Double> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if (root == null)
            return ans;

        q.add(root);
        while (!q.isEmpty()) {
            int level = q.size();
            double sum = 0;
            int nodeCount = 0;

            TreeNode node = q.peek();
            for (int i = 0; i < level; i++) {

                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
                sum += q.remove().val;
                nodeCount++;
            }
            ans.add(sum / nodeCount);

        }
        return ans;
    }
}

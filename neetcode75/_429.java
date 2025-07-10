import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue; 

public class _429 {
    /*
     * // Definition for a Node. class Node { public int val; public List<Node> children;
     * 
     * public Node() {}
     * 
     * public Node(int _val) { val = _val; }
     * 
     * public Node(int _val, List<Node> _children) { val = _val; children = _children; } };
     */


    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();

        if (root == null)
            return ans;

        Queue<Node> q = new LinkedList<>();

        q.add(root);
        while (!q.isEmpty()) {
            int level = q.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < level; i++) {
                Node node = q.remove();
                // children
                list.add(node.val);
                for (Node child : node.children) {
                    q.offer(child);
                }
            }
            ans.add(new ArrayList(list));
        }
        return ans;

    }
}


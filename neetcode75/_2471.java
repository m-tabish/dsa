import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import javax.swing.tree.TreeNode;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left,
 * TreeNode right) { this.val = val; this.left = left; this.right = right; } }
 */
class _2471 {
    public int minimumOperations(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int sortCount = 0;

        // Perform level-order traversal (BFS)
        while (!q.isEmpty()) {
            int level = q.size();
            List<Integer> list = new ArrayList<>();

            // Process all nodes at the current level
            for (int j = 0; j < level; j++) {
                TreeNode node = q.remove();
                list.add(node.val); // Collect values of current level

                // Add child nodes to the queue for next level
                if (node.left != null)
                    q.offer(node.left);
                if (node.right != null)
                    q.offer(node.right);
            }

            // Calculate and add the number of swaps required to sort this level
            sortCount += swap(list);
        }

        return sortCount;
    }

    // Helper method to count minimum swaps to sort a list
    private int swap(List<Integer> list) {
        int count = 0;

        // Copy and sort the list
        List<Integer> sortedList = new ArrayList<>(list);
        Collections.sort(list); // Sorted version of the level
        HashMap<Integer, Integer> map = new HashMap<>();

        // Map value → index in the sorted list
        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i), i);
        }

        // Compare original (unsorted) list with the sorted one
        for (int i = 0; i < list.size(); i++) {
            // If the element is not in the correct position
            if (!list.get(i).equals(sortedList.get(i))) {
                int idxS = i; // current index
                int idxT = map.get(sortedList.get(i)); // target index from sorted list

                // Swap elements in list
                Collections.swap(list, idxS, idxT);

                // Update map with new positions after the swap
                map.put(list.get(idxS), idxS);
                map.put(list.get(idxT), idxT);

                count++; // Increment swap counter
            }
        }

        return count;
    }
}

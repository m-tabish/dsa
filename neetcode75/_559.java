// dfs
 

class _559 {
    public int maxDepth(Node root) {
        if (root == null)
            return 0;

        int depth = 0;
        for (Node node : root.children) {
            depth = Math.max(maxDepth(node), depth);
        }
        return depth + 1;

    }

}

// bfs
// class Solution {
// public int maxDepth(Node root) {
// if (root == null)
// return 0;

// Queue<Node> q = new LinkedList<>();
// q.offer(root);

// int depth = 0;
// while (!q.isEmpty()) {
// int level = q.size();

// for (int i = 0; i < level; i++) {
// Node node = q.poll();

// for (Node cur : node.children) {
// q.offer(cur);
// }

// }
// depth++;
// }

// return depth;

// }

// }

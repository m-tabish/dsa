 

class _666 {
    String str = "";

    public String tree2str(TreeNode root) {
        dfs(root);
        return str.substring(1, str.length() - 1);
    }

    private void dfs(TreeNode root) {
        if (root == null)
            return;
        str += "(";

        str += String.valueOf(root.val);

        // if(root.left==null)
        // str+=")";

        if (root.left == null && root.right != null)
            str += "()";
        dfs(root.left);


        dfs(root.right);
        // if(root.right==null)
        str += ")";


    }
}

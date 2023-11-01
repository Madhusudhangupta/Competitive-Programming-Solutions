class Solution {
    int count = 0;

    public void findMax(TreeNode node, int curMax) {
        if(node == null)
            return;
        if(node.val >= curMax) {
            count += 1;
            curMax = node.val;
        }
        findMax(node.left, curMax);
        findMax(node.right, curMax);
    }

    public int goodNodes(TreeNode root) {
        if(root == null)
            return 0;
        if(root.left==null && root.right==null)
            return 1;
        findMax(root, Integer.MIN_VALUE);
        return count;
    }
}

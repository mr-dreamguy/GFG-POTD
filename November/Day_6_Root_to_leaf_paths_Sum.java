class Solution {
    public static int treePathsSum(Node root) {
        return treePathsSum(root, 0);
    }
    
    private static int treePathsSum(Node root, int val) {
        if (root == null) return 0;

        val = val * 10 + root.data;

        if (root.left == null && root.right == null)
            return val;

        return treePathsSum(root.left, val) + treePathsSum(root.right, val);        
    }
}
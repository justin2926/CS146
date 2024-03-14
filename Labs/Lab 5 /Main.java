public boolean isValidBST(TreeNode root) {
        return isValidBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }

public boolean isValidBST(TreeNode root,long minVal,long maxVal) {
    if (root == null)
        return true;

    if (root.val <= minVal || root.val >= maxVal)
        return false;
    
    boolean left = isValidBST(root.left,minVal,root.val);
    boolean right = isValidBST(root.right,root.val,maxVal);

    return left && right;
}

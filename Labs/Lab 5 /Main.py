def isValidBST(self, root: Optional[TreeNode]) -> bool:
    def validBST(root, minVal=float('-inf'), maxVal=float('inf')):
        if root is None:
            return True

        if not (minVal < root.val < maxVal):
            return False

        left = validBST(root.left , minVal, root.val)
        right = validBST(root.right, root.val, maxVal)

        return left and right
    return validBST(root)

def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
    ans = []

    q = collections.deque()
    q.append(root)

    while q:
        length = len(q)
        level = []
        for i in range(length):
            n = q.popleft()
            if n:
                level.append(n.val)
                q.append(n.left)
                q.append(n.right)
        if level:
            ans.append(level)
    return ans

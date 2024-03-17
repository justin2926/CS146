public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Queue<TreeNode> q = new LinkedList<>();

        if (root == null) {
            return ans;
        }

        q.add(root);
        while (!q.isEmpty()) {
            int length = q.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < length; i++) {
                if (q.peek().left != null) {
                    q.add(q.peek().left);
                }
                if (q.peek().right != null) {
                    q.add(q.peek().right);
                }
                level.add(q.remove().val);
            }
            ans.add(level);
        }
        return ans;
    }

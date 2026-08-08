/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {

            int size = q.size();

            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < size; i++) {

                TreeNode tree = q.poll();

                list.add(tree.val);

                if (tree.left != null) {
                    q.add(tree.left);
                }

                if (tree.right != null) {
                    q.add(tree.right);
                }
            }

            result.add(list);
        }

        return result;
        
    }
}

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
     HashMap<Integer,Integer>map=new HashMap<>();
    int preindex=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++){
        map.put(inorder[i],i);
       }
       return build(preorder,0,inorder.length-1);
        
    }
    public TreeNode build(int[] preorder,int left,int right){
        if(left>right){
            return null;
        }
        int rootval=preorder[preindex++];
        TreeNode node=new TreeNode(rootval);
        int index=map.get(rootval);

        node.left=build(preorder,left,index-1);
        node.right=build(preorder,index+1,right);
        return node;
    }
}

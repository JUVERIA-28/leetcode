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
    public int sumOfLeftLeaves(TreeNode root) {
        
        return res(root,false);
    }
    public int res(TreeNode r,boolean l){
        if(r==null){
            return 0;
        }
        if(r.left==null && r.right==null){
            return l?r.val:0;
        }
        int x=res(r.left,true);
        int y=res(r.right,false);

        return x+y;
    }
}
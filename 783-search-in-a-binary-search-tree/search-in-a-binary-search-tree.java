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
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null)
        {
            return null;

        }
        TreeNode c=root;
        while(c!=null)
        {
            if(c.val==val)
            {
                return c;
            }
            else if(c.val<val){
                c=c.right;
            }else{
                c=c.left;
            }
        }
        return null;
    }
}
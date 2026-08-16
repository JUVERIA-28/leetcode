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
    
    public boolean leafSimilar(TreeNode root1, TreeNode root2) 
    {
        List<Integer> n1=new ArrayList<>();
        List<Integer> n2=new ArrayList<>();
        leaf(root1,n1);
        leaf(root2,n2);
        return n1.equals(n2);
    }
    public void leaf(TreeNode node,List<Integer>nl)
    {
        if(node==null)
        {
            return;
        }
        if(node.left==null && node.right==null)
        {
            nl.add(node.val);
        }
        else{
            leaf(node.left,nl);
            leaf(node.right,nl);
        }
    }
}
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
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> v = new ArrayList<>();
        in(root,v);
        return balance(v,0,v.size()-1);
    }
    public void in(TreeNode node , List<Integer> v){
        if(node==null){
            return;
        }
        in(node.left,v);
        v.add(node.val);
        in(node.right,v);
    }
    public TreeNode balance(List<Integer> v , int l,int r){
        if(l>r){
            return null;
        }
        int m = l+(r-l)/2;
        TreeNode node = new TreeNode(v.get(m));
        node.left=balance(v,l,m-1);
        node.right=balance(v,m+1,r);
        return node;
    }
}
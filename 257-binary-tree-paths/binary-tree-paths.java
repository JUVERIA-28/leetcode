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
    public void btp(TreeNode r,ArrayList<String> a,String s){
        if(r.left==null && r.right==null){
            s=s+r.val;
            a.add(s);
        }s=s+r.val;
        if(r.left!=null){
            btp(r.left,a,s+"->");
        }
        if(r.right!=null){
            btp(r.right,a,s+"->");
        }
    }
    public List<String> binaryTreePaths(TreeNode root) {
        String s="";
        ArrayList<String> a=new ArrayList<>();
        btp(root,a,s);
        return a;
    }
}
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
    int c=0;
    int mac=0;
    Integer p=null;
    List<Integer> l=new ArrayList<>();
    public int[] findMode(TreeNode root) {
        in(root);
        int[] res=new int[l.size()];
        for(int i=0;i<l.size();i++){
            res[i]=l.get(i);
        }
        return res;
    }
    private void in(TreeNode root){
        if(root==null){
            return ;
        }
        in(root.left);
        if(p==null || root.val!=p){
            c=1;
        }else{
            c++;
        }
        if(c>mac){
            mac=c;
            l.clear();
            l.add(root.val);
        }else if(c==mac){
            l.add(root.val);
        }
        p=root.val;
        in(root.right);
    }
}
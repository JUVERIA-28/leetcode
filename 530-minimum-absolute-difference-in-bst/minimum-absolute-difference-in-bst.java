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
    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> a=new ArrayList<>();
        inorder(root,a);
        int min=Integer.MAX_VALUE;
        for(int i=1;i<a.size();i++){
            min=Math.min(min,Math.abs(a.get(i-1)-a.get(i)));
        }
        return min;
    }
    static void inorder(TreeNode r,ArrayList<Integer> a){
        if(r==null){
            return;
        }
        inorder(r.left,a);
        a.add(r.val);
        inorder(r.right,a);
    }
}
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
    public List<Double> averageOfLevels(TreeNode root) 
    {
        Queue<TreeNode> q=new LinkedList<>(List.of(root));
        List<Double> ans = new ArrayList<>();
        while(q.size()>0)
        {
            double len = q.size(),r=0;
            for(int i=0;i<len;i++){
                TreeNode cur=q.poll();
                r+=cur.val;
                if(cur.left!=null){
                    q.offer(cur.left);
                }
                if(cur.right!=null){
                    q.offer(cur.right);
                }

            }
            ans.add(r/len);
        }
        return ans;
    }
}
class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination)
    {
        Map<Integer,ArrayList<Integer>> g=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            g.put(i,new ArrayList<>());
        }  
        for(int[] e:edges)
        {
            int u=e[0];
            int v=e[1];
            g.get(u).add(v);
            g.get(v).add(u);
        }
        //System.out.println(g); 
        Queue<Integer> q=new LinkedList<>();
        Set<Integer> vis=new HashSet<>();
        vis.add(source);
        q.add(source);
        while(!q.isEmpty())
        {
            int u=q.remove();
            if(u==destination){
                return true;
            }
            for(int v:g.get(u)){
                if(!vis.contains(v)){

                q.add(v);
                vis.add(v);
                }
            }
        }

        return false;
    }
}
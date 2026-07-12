class Solution {
    public int[] arrayRankTransform(int[] arr)
    {
        int[] a=Arrays.copyOf(arr,arr.length);
        Arrays.sort(a);
        int r=1;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int x:a)
        {
            if(!mp.containsKey(x))
            {
                mp.put(x,r++);
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=mp.get(arr[i]);
        }
        return arr;
    }
}
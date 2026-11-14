class Solution {
    
      List<List<Integer>> res;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        res=new ArrayList<>();
        Arrays.sort(candidates);
        List<Integer> cur=new ArrayList<>(); 
          backtrack(candidates,target,0,cur,0);
          return res;
        }
       public void backtrack(int[] arr, int target,int total,List<Integer> cur,int i)
       {
        if(target==total)
        {
            res.add(new ArrayList<>(cur));
            return;
        }
        for(int j=i;j<arr.length;j++)
        {
            if(j>i&&arr[j]==arr[j-1])continue;
            if(total+arr[j]>target)return;
            cur.add(arr[j]);
            backtrack(arr,target,total+arr[j],cur,j+1);
            cur.remove(cur.size()-1);
        }
       }

}  
   
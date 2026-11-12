class Solution {
    public List<List<Integer>> subsets(int[] nums) {
         List<List<Integer>> res=new ArrayList<>();
         List<Integer> cur=new ArrayList<>();
         backtrack(nums,res,cur,0);
         return res;


    }
    public void backtrack(int[] nums, List<List<Integer>> res, List<Integer> cur,int i)
    {
        if(i>=nums.length)
        {
            res.add(new ArrayList(cur));
            return;
        }
        cur.add(nums[i]);
        backtrack(nums,res,cur,i+1);
        cur.remove(cur.size()-1);
        backtrack(nums,res,cur,i+1);
    }
}
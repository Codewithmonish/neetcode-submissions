class Solution {
    List<List<Integer>>result=new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        backtrack(nums,new ArrayList<>());
        return result;
        
    }
    public void backtrack(int[] nums,List<Integer>current){
        if(current.size()==nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(current.contains(nums[i])){
                continue;
            }

            current.add(nums[i]);
            backtrack(nums,current);
            current.remove(current.size()-1);
        }
    }
}

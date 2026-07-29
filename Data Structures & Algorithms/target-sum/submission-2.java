class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int num:nums){
            Map<Integer,Integer> next=new HashMap<>();
            for(Map.Entry<Integer,Integer> e:map.entrySet()){
                int sum=e.getKey();
                int ways=e.getValue();
                next.put(sum+num,next.getOrDefault(sum+num,0)+ways);
                next.put(sum-num,next.getOrDefault(sum-num,0)+ways);
            }
            map=next;
        }
        return map.getOrDefault(target,0);
        
    }
}

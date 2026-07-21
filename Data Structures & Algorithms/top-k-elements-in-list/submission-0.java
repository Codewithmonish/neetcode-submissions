class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int arr:nums){
            map.put(arr,map.getOrDefault(arr,0)+1);
        }
        int n=nums.length;
        List<Integer>[] bucket=new List[n+1];
        for(Map.Entry<Integer,Integer>e:map.entrySet()){
            int freq=e.getValue();
            if(bucket[freq]==null){
                bucket[freq]=new ArrayList<>();
            }
            bucket[freq].add(e.getKey());
        }
        int[] res=new int[k];
        int ind=0;
        for(int i=bucket.length-1;i>=0 && ind<k;i--){
            if(bucket[i]!=null){
                for(int ar:bucket[i]){
                    res[ind++]=ar;
                    if(ind==k){
                        break;
                    }
                }
            }
        }
        return res;
       
    }
}

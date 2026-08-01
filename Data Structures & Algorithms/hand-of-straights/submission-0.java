class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length%groupSize!=0){
            return false;
        }
        Arrays.sort(hand);
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:hand){
            map.put(num,map.getOrDefault(num,0)+1);

        }
        for(int card:hand){
            if(map.get(card)==0)
                continue;
                for(int i=0;i<groupSize;i++){
                    int cur=card+i;

                    if(map.getOrDefault(cur,0)==0){
                        return false;
                    }
                    map.put(cur,map.get(cur)-1);
                }
            
        }
        return true;
        
    }
}

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas=0;
        int totalcost=0;
        for(int g:gas){
            totalgas+=g;
        }
        for(int c:cost){
            totalcost+=c;
        }
        if(totalgas<totalcost){
            return -1;
        }
        int tank=0;
        int start=0;
        for(int i=0;i<gas.length;i++){
            tank+=gas[i]-cost[i];
           
            if(tank<0){
                tank=0;
                start=i+1;

            }

        }
        return start;
    }
}

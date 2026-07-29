class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
       List<int[]> result=new ArrayList<>();
       int[] newinterval=intervals[0];
        result.add(newinterval);
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=newinterval[1]){
                newinterval[1]=Math.max(intervals[i][1],newinterval[1]);
            }
            else{
                newinterval=intervals[i];
                result.add(newinterval);
            }
        }
        return result.toArray(new int[result.size()][]);
        
    }
}

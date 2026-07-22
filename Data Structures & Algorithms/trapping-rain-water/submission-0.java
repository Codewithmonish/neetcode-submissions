class Solution {
    public int trap(int[] height) {
        int i=0;
        int j=height.length-1;
        int maxleft=0;
        int maxright=0;
        int water=0;
        while(i<j){
            if(height[i]<=height[j]){
                maxleft=Math.max(maxleft,height[i]);
                water+=maxleft-height[i];
                i++;
            }
            else{
                 maxright=Math.max(maxright,height[j]);
                water+=maxright-height[j];
                j--;

            }
        }
        return water;
        
    }
}

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer>st=new Stack();
        int[] ans=new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            while(!st.isEmpty() && temperatures[i]>temperatures[st.peek()]){
                int ind=st.pop();
                ans[ind]=i-ind;
            }
            st.push(i);
        }
        return ans;
        
    }
}

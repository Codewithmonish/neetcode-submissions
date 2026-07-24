class Solution {
    public int largestRectangleArea(int[] heights) {
        int[] pse=findpse(heights);
        int[] nse=findnse(heights);
        int max=0;
        for(int i=0;i<heights.length;i++){
            int width=nse[i]-pse[i]-1;
            int area=heights[i]*width;
            max=Math.max(max,area);
        }
        return max;
        
    }
    public int[] findpse(int[] arr){
        int n=arr.length;
        Stack<Integer>st=new Stack();
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=-1;
            }
            else{
                ans[i]=st.peek();
            }
            st.push(i);
        }
        return ans;
    }
    public int[] findnse(int[] arr){
        int n=arr.length;
        Stack<Integer>st=new Stack();
        int[] ans=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=n;
            }
            else{
                ans[i]=st.peek();
            }
            st.push(i);
        }
        return ans;
    }
}

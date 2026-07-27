class Solution {
    public String longestPalindrome(String s) {
        String ans="";
        for(int i=0;i<s.length();i++){
            if(expand(s,i,i).length()>ans.length()){
                ans=expand(s,i,i);
            }
        }
        for(int i=0;i<s.length()-1;i++){
            if(expand(s,i,i+1).length()>ans.length()){
                ans=expand(s,i,i+1);
            }
        }
        return ans;
        
    }
    public String expand(String s,int left,int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;

        }
        return s.substring(left+1,right);
    }
}

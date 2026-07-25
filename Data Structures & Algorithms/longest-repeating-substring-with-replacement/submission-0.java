class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq=new int[26];
        int left=0;
        int maxfreq=0;
        int max=0;
        for(int right=0;right<s.length();right++){
            freq[s.charAt(right)-'A']++;

            max=Math.max(max,freq[s.charAt(right)-'A']);
            int len=right-left+1;
            if(len-max>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            len=right-left+1;
            maxfreq=Math.max(maxfreq,len);
        }
        return maxfreq;
        
    }
}

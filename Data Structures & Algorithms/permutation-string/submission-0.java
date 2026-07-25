class Solution {
    public boolean checkInclusion(String s1, String s2) {
         if(s1.length()>s2.length()){
            return false;
        }
        int[] frq1=new int[26];
        int[] frq2=new int[26];
        for(int i=0;i<s1.length();i++){
            frq1[s1.charAt(i)-'a']++;
            frq2[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(frq1,frq2)){
            return true;
        }
        for(int right=s1.length();right<s2.length();right++){
            frq2[s2.charAt(right)-'a']++;
            frq2[s2.charAt(right-s1.length())-'a']--;
             if(Arrays.equals(frq1,frq2)){
            return true;
        }
        }
        return false;
        
    }
}

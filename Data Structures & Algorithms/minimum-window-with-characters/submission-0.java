class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer> map=new HashMap<>();
        int left=0;
        int right=0;
        int min=Integer.MAX_VALUE;
        int count=t.length();
        int start=0;
        for(char c:t.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        while(right<s.length()){
            char c=s.charAt(right);
            if(map.containsKey(c)){
                if(map.get(c)>0){
                   count--;
                }
                 map.put(c,map.get(c)-1);
            }
            right++;
            while(count==0){
                if(right-left<min){
                    min=right-left;
                    start=left;
                }
                 char ch=s.charAt(left);
            if(map.containsKey(ch)){
                
                 map.put(ch,map.get(ch)+1);
                 if(map.get(ch)>0){
                   count++;
                }
            }
            left++;
            }
        }
       if(min == Integer.MAX_VALUE)
    return "";

      return s.substring(start, start + min);
        
    }
}

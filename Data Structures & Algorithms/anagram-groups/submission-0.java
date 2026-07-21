class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        
        for(String word:strs){
            char[] s=word.toCharArray();
            Arrays.sort(s);
            String key=new String(s);
            map.computeIfAbsent(key,k->new ArrayList<>()).add(word);

        }
        return new ArrayList<>(map.values());
        
    }
}

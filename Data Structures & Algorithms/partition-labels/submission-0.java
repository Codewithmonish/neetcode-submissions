class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            int startindex=i;
            int lastindex=s.lastIndexOf(s.charAt(startindex));

            for(int j=startindex+1;j<=lastindex-1;j++){
                int lastindexnext=s.lastIndexOf(s.charAt(j));

                if(lastindexnext> lastindex){
                    lastindex=lastindexnext;
                }
            }
            list.add(lastindex-startindex+1);
            i=lastindex;

        }
        return list;
        
    }
}

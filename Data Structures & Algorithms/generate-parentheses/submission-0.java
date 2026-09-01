class Solution {
    List<String>result=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        backtrack(0,0,n,"");
        return result;
        
    }
    public void backtrack(int ob,int cb,int n,String ans){
        if(ans.length()==2*n){
            result.add(ans);
            return;
        }
        if(ob<n){
            backtrack(ob+1,cb,n,ans+"(");
        }
        if(cb<ob){
            backtrack(ob,cb+1,n,ans+")");
        }
    }
}

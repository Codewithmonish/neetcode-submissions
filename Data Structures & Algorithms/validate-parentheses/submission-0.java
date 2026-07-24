class Solution {
    public boolean isValid(String s) {
        Stack<Character> set=new Stack();
        for(char c:s.toCharArray()){
            if(c=='{' || c=='[' || c=='('){
                set.push(c);
            }
            else{
                if(set.isEmpty()){
                    return false;
                }
                char top=set.pop();
                if(!matching(top,c)){
                    return false;
                }
            }
        }
        return set.isEmpty();
        
    }
    public boolean matching(char o,char c){
        return(o=='{' && c=='}')||
              (o=='[' && c==']') ||
              (o=='(' && c==')');
    }
}

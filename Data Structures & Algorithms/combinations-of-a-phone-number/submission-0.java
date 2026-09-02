class Solution {
    public List<String> letterCombinations(String digits) {
        List<String>result=new ArrayList<>();
        if(digits.length()==0){
            return result;
        }
        String[] phone={""," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxzy"};
        backtrack(digits,0,"",result,phone);
        return result;        
    }

    public void backtrack(String digits,int index,String current,List<String>result,String[]phone){
        if(index==digits.length()){
            result.add(current);
            return;
        }

        String letter=phone[digits.charAt(index)-'0'];

        for(char c:letter.toCharArray()){
            backtrack(digits,index+1,current+c,result,phone);
        }
    }
}

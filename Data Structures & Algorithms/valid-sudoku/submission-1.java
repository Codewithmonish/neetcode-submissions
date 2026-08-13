class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashMap<Integer,HashSet<Character>> row=new HashMap<>();
        HashMap<Integer,HashSet<Character>> col=new HashMap<>();
        HashMap<Integer,HashSet<Character>> box=new HashMap<>();
        for(int i=0;i<9;i++){
            row.put(i,new HashSet<>());
            col.put(i,new HashSet<>());
            box.put(i,new HashSet<>());
        }

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                char num=board[i][j];
                int boxs=(i/3)*3+(j/3);

                if(row.get(i).contains(num)){
                    return false;
                }
                 if(col.get(j).contains(num)){
                    return false;
                }
                 if(box.get(boxs).contains(num)){
                    return false;
                }
                row.get(i).add(num);
                col.get(j).add(num);
                box.get(boxs).add(num);
            }
        }
        return true;
        
    }
}

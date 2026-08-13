class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] time=new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(time[i],Integer.MAX_VALUE);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    dfs(grid,time,i,j,0);
                }
            }
        }
        int timefre=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    if(time[i][j]==Integer.MAX_VALUE){
                        return -1;
                    }
                    timefre=Math.max(timefre,time[i][j]);
                }
            }
        }
        return timefre;
        
        
    }
    public void dfs(int[][] grid,int[][] time,int i,int j,int current){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]==0 || current>=time[i][j]){
            return;
        }
        time[i][j]=current;
        dfs(grid,time,i+1,j,current+1);
          dfs(grid,time,i-1,j,current+1);
            dfs(grid,time,i,j+1,current+1);
              dfs(grid,time,i,j-1,current+1);
    }
}

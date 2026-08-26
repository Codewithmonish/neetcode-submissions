class Solution {
    List<List<Integer>>graph;
    public int[] findRedundantConnection(int[][] edges) {
        
        int n=edges.length;
        graph=new ArrayList<>();
        for(int i=0;i<=n;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];

            if(bfs(u,v,n)){
                return edge;
            }

            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        return new int[]{};

    }
    public boolean bfs(int start,int target,int n){
        Queue<Integer>q=new LinkedList<>();
        boolean[] visited=new boolean[n+1];
        q.add(start);
        visited[start]=true;
        while(!q.isEmpty()){
            int current =q.poll();
            if(current ==target){
                return true;
            }

            for(int next:graph.get(current)){
                if(!visited[next]){
                    q.add(next);
                    visited[next]=true;
                }
            }
        }
        return false;
        }
}

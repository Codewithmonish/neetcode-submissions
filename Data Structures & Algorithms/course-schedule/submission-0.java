class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph=new ArrayList<>();
        int[] indegre=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }

        for(int[] pre:prerequisites){
            int course=pre[0];
            int prerequisite=pre[1];
            graph.get(prerequisite).add(course);
            indegre[course]++;

        }

        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegre[i]==0){
                q.offer(i);
            }
        }
        int count=0;
        while(!q.isEmpty()){
            int curr=q.poll();
            count++;
            for(int next:graph.get(curr)){
                indegre[next]--;
                if(indegre[next]==0){
                    q.offer(next);
                }
            }
        }
        return count==numCourses;
        
    }
}

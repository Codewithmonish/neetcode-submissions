class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {

        List<List<Integer>>graph=new ArrayList<>();
        int[] indegre=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] pre: prerequisites){
            int course=pre[0];
            int preq=pre[1];
            graph.get(preq).add(course);
            indegre[course]++;
        }

        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegre[i]==0){
                q.offer(i);
            }
        }
        int[] order = new int[numCourses];
        int index = 0;
        while(!q.isEmpty()){
            int curr=q.poll();
            order[index++] = curr;
            
            for(int next:graph.get(curr)){
                indegre[next]--;

                if(indegre[next]==0){
                    q.offer(next);
                }
            }
        }
        if(index != numCourses){
             return new int[0];
         }
        return order;
    }
}

class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
            List<Integer> list = new ArrayList<>();
            list.add(0);
            dfs(graph,result,0,list);
        
        return result;
    }
    
    private void dfs(int[][] graph,List<List<Integer>> result,int i, List<Integer> list){
        
        if(i==graph.length-1){
            result.add(new ArrayList<Integer>(list));//This is executed when the target is reached
            return;
        }
        
        for(int j=0;j<graph[i].length;j++){
            list.add(graph[i][j]);
            dfs(graph,result,graph[i][j],list);
            list.remove(list.size()-1);
        }
        
    }
}
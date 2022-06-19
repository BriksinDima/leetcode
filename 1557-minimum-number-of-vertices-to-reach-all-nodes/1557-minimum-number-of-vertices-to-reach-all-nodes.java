class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
          Map<Integer, List<Integer>> g = new HashMap<>();
        int[] indegree = new int[n];
        for (int i=0; i<n; i++) {
            g.put(i, new ArrayList<Integer>());
        }
        
        for (List<Integer> e: edges) {
            g.get(e.get(0)).add(e.get(1));
            indegree[e.get(1)]++;
        }
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(indegree[i]==0)
                result.add(i);
        }
        return result;
    
    }
}
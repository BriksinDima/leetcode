class Solution {
    public int maxDepth(String s) {
      Stack<Character> stack = new Stack<>();
        int depth = 0;
        for(char c: s.toCharArray()){
            if(c=='(') stack.push(c);
            else if(c==')'){
                depth = Math.max(depth, stack.size());
                stack.pop();
            }
        }
        return depth;   
    }
}
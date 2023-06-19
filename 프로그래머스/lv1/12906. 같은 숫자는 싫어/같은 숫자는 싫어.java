import java.util.Stack;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        
        for(int i : arr){
            if(stack.empty())
                stack.push(i);
            else if(stack.peek()!=i)
                stack.push(i);
        }
        
        int[] ans = new int[stack.size()];
        for(int i=0;i<ans.length;i++){
            ans[i] = stack.get(i);
        }
        return ans;
    }
}
import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        int[] ans = new int[arr.length];
        if(arr.length == 1){
            ans[0] = -1;
            return ans;
        }
        else{
            int[] copy = arr;
            Arrays.sort(copy);
            int min = copy[0];
            int count = 0;
            for(int i : arr){
                if(i!=min){
                    ans[count] = i;
                    count++;
                }
            }
            return ans;
        }
    }
}
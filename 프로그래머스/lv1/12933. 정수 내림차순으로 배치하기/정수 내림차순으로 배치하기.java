import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String str_n = Long.toString(n);       
        int[] long_arr = new int[str_n.length()];
        for(int i =0;i<str_n.length();i++){
            long_arr[i] = Character.getNumericValue(str_n.charAt(i));
        }

        Arrays.sort(long_arr);    
        String str_temp = "";
        
        long answer = 0;
        
        for(int i = long_arr.length-1;i>=0;i--){
            str_temp += long_arr[i];
        }
        answer = Long.parseLong(str_temp);
        return answer;
    }
}
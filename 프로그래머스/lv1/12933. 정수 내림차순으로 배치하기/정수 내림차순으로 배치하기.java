import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String str_n = Long.toString(n);       
        long[] long_arr = new long[str_n.length()];
        for(int i =0;i<str_n.length();i++){
            long_arr[i] = str_n.charAt(i) - '0';
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
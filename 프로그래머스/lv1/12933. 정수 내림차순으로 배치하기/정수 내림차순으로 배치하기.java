import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String str_n = Long.toString(n);
        
        char[] charArray = str_n.toCharArray();
        Arrays.sort(charArray);
        
        String temp = "";
        for(int i = charArray.length-1; i >= 0; i--){
            temp += charArray[i];           
        }
        answer = Long.parseLong(temp);    
        return answer;
    }
}
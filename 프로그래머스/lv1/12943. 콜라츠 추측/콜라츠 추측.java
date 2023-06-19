class Solution {
    public int solution(int num) {
        if(num==1)
            return 0;
        
        long num_copy = num;
        int count = 0;
        while(num_copy!=1 && count != 501){
            count++;
            if(num_copy%2==0)
                num_copy = num_copy/2;
            else
                num_copy = (num_copy*3)+1;
        }
        if(count == 501)
            return -1;
        else
            return count;
    }
}
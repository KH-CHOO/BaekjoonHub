class Solution {
    public long solution(long n) {
        double sqrt = Math.sqrt(n);
        long test = (long)Math.sqrt(n);
        if(sqrt == test)
            return (test+1)*(test+1);
        else
            return -1;
    }
}
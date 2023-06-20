class Solution {
    public int[] solution(int n, int m) {
        int gcd = 1;
        for(int j = 1; j<=n && j<=m; j++){
            if(n%j==0 && m%j==0)
                gcd = j;
        }
        int lcm = n*m/gcd;
        return new int[]{gcd,lcm};
    }
}
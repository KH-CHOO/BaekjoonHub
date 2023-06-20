class Solution {
    public int solution(int n) {
        int ans = 0;
        for(int i = 2; i<=n;i++){
            if(n%i==1){
                ans = i;
                break;}
        }
        return ans;
    }
}
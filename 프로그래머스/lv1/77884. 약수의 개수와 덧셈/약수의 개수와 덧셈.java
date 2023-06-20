class Solution {
    public int solution(int left, int right) {
        int sum = 0;
        for(int i =left;i<=right;i++){
            int num = i;
            int count = 0;
            for(int j=1;j<=num;j++){
                if(num%j==0)
                    count++;
            }
            if(count%2==0)
                sum += num;
            else
                sum -= num;
        }

        return sum;
    }
}
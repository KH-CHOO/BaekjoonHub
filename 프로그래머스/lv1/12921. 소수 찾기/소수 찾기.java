class Solution {
    public int solution(int n) {
        if (n == 1)
            return 0;
        
        int prime_count = 0;
            for (int i = 2; i <= n; i++) {
                boolean isPrime = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime)
                    prime_count++;
            }
            return prime_count;
    }

}
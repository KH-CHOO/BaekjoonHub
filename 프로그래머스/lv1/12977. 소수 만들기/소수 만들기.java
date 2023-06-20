import java.util.ArrayList;
class Solution {
    // 3<=nums.length<=50
    // 1<=nums[i]<=1000
    // 중복 숫자 없음 
    public int solution(int[] nums) {

        ArrayList<Integer> sumlist = new ArrayList<>();

        for(int i =0;i<=nums.length-3;i++){
            for(int j=i+1;j<=nums.length-2;j++){
                for(int k=j+1;k<=nums.length-1;k++){
                    sumlist.add(nums[i]+nums[j]+nums[k]);
                }
            }
        }
        System.out.println(sumlist);

        int count = 0;
        for(int i : sumlist){
            if(isPrime(i)){
                System.out.println(i);
                count++;
            }
        }

        return count;
    }

    static boolean isPrime(int n){
        if(n == 1)
            return false;
        else if(n == 2 || n == 3)
            return true;
        else {
            for(int i = 2; i<= Math.sqrt(n); i++){
                if(n%i==0)
                    return false;
            }
            return true;
        }
    }
}
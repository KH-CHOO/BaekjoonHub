import java.util.HashSet;
class Solution {
    // 가능한 가장 많은 종류를 선택한 경우에서 종류의 개수를 return
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i< nums.length; i++){
            set.add(nums[i]);
        }

        if(set.size()<(nums.length)/2)
            return set.size();
        else
            return (nums.length)/2;
    }
}
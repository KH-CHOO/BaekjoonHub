class Solution {
    public boolean solution(int x) {
        
        int copy_x = x;
        
        int sum = 0;
        while(copy_x!=0)
        {
            sum += copy_x % 10;
            copy_x /= 10;
        }
        
        if(x%sum==0){
            return true;
        }
        else
            return false;
    }
}
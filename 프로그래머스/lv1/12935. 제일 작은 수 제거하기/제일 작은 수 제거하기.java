class Solution {
    public int[] solution(int[] arr) {
        int[] test = {-1};
        if(arr.length == 1){
            return test;
        }
        
        int min = 0;
        for(int i =1;i<arr.length;i++){
            if(arr[i]<arr[min]){
                min = i;
            }
        }
        // 최소값 = arr[min]
        
        int[] answer = new int[arr.length-1];
        for(int i =0,j=0;i<arr.length;i++){
            if(i!=min)
                answer[j++] = arr[i];
        }

        // int[] answer = {};
        return answer;
    }
}
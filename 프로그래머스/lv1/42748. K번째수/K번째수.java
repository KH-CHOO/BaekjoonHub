import java.util.Arrays;
class Solution {
    // 1 <= array.length <= 100 , 1 <= array[i] <= 100
    // 1 <= commands.length <= 50 , commands[i].length == 3
    public int[] solution(int[] array, int[][] commands) {

        int[] result = new int[commands.length];
        int resultIndex = 0;
        for(int[] command:commands){
            int i = command[0];
            int j = command[1];
            int k = command[2];

            //e.g. [1, 5, 2, 6, 3, 7, 4], i=2,j=5
            int[] step1 = new int[j-i+1];
            for(int s=0;s< step1.length;s++){
                step1[s] = array[s+i-1];
            }
            Arrays.sort(step1);
            result[resultIndex] = step1[k-1];
            resultIndex++;
        }
        return result;
    }
}
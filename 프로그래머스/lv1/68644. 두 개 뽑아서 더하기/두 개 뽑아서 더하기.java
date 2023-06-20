import java.util.SortedSet;
import java.util.TreeSet;
class Solution {
    public int[] solution(int[] numbers) {
		SortedSet<Integer> combinations = new TreeSet<>();
		
		for(int i=0;i<=numbers.length-2;i++){
			for(int j=i+1;j<=numbers.length-1;j++){
				int comb = numbers[j] + numbers[i];
				combinations.add(comb);
			}
		}
		
		// Convert SortedSet to array
        int[] result = new int[combinations.size()];
        int index = 0;
        for (int number : combinations) {
            result[index++] = number;
        }

        return result;

    }
}
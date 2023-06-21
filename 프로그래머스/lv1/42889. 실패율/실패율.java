import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int N, int[] stages) {

        Map<Integer, Integer> stage_map_reached_user_count = new HashMap<>();
        Map<Integer, Integer> stage_map_not_cleared_user_count = new HashMap<>();

        for(int i = 1; i<=N+1;i++){
            stage_map_reached_user_count.put(i,0);
            stage_map_not_cleared_user_count.put(i,0);
        }

        for(int i = 0; i<stages.length; i++){
            int stage = stages[i]; // user[i]'s current stage
            int not_cleared_user = stage_map_not_cleared_user_count.get(stage);
            stage_map_not_cleared_user_count.put(stage, not_cleared_user + 1);
            for(int j=1;j<=stage;j++){
                int reached_user_count = stage_map_reached_user_count.get(j);
                stage_map_reached_user_count.put(j, reached_user_count + 1);
            }
        }

        Map<Integer, Double> stage_failureRate = new HashMap<>();
        for(int i =1; i<=N;i++){
            int value1 = stage_map_not_cleared_user_count.get(i);
            int value2 = stage_map_reached_user_count.get(i);
            if(value2==0){
                value1 = 0;
                value2 = 1;
            }
            double failureRate = (double)value1 / value2;
            stage_failureRate.put(i,failureRate);
            System.out.println(i+"스테이지 실패율: "+stage_failureRate.get(i));
        }

        List<Integer> sortedKeys = stage_failureRate.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, Double>comparingByValue().reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        int[] result = sortedKeys.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }
}

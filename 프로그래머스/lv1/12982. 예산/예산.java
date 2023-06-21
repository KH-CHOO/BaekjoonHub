import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int solution(int[] d, int budget) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int d_e: d){
            list.add(d_e);
        }
        Collections.sort(list);

        int sum = 0;
        for(int l:list){
            sum+= l;
        }
        System.out.println(sum);
        System.out.println(budget);

        if(sum<=budget){
            return list.size();
        }else{ // sum > budget
            while(true){
                int check = 0;
                list.remove(list.size()-1);
                for(int l:list){
                    check += l;
                }
                if(check<=budget)
                    break;
            }
            return list.size();
        }
    }
}
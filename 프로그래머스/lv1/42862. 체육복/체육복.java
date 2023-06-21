import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        
        Map<Integer, Integer> student_howManySportsware = new HashMap<>();

        for(int i = 1; i<=n; i++) student_howManySportsware.put(i,1);
        
        // 여벌 있는 학생 -> 2벌
        for(int i=0; i<reserve.length;i++){
            int sr_num = reserve[i];
            student_howManySportsware.put(sr_num,2);
        }

        // 도난당한 학생 -> (가지고 있던 옷 개수 - 1)벌
        for(int i = 0; i<lost.length;i++){
            int sl_num = lost[i];
            int sportsware_count = student_howManySportsware.get(sl_num);
            student_howManySportsware.put(sl_num, sportsware_count - 1);
        }

        // 학생전체 루프
        for(int i = 1; i<=n;i++){
            if(i == 1){ // 뒤 검사
                if(student_howManySportsware.get(i) == 0 && student_howManySportsware.get(i+1)==2){
                    student_howManySportsware.put(i,1);
                    student_howManySportsware.put(i+1,1);
                }else if(student_howManySportsware.get(i)==2 && student_howManySportsware.get(i+1)==0){
                    student_howManySportsware.put(i,1);
                    student_howManySportsware.put(i+1,1);
                }
            }else if(i < n){ // 앞 검사 후 뒤 검사
                if(student_howManySportsware.get(i-1) == 0 && student_howManySportsware.get(i)==2){
                    student_howManySportsware.put(i-1,1);
                    student_howManySportsware.put(i,1);
                }else if(student_howManySportsware.get(i-1)==2 && student_howManySportsware.get(i)==0){
                    student_howManySportsware.put(i-1,1);
                    student_howManySportsware.put(i,1);
                }else if(student_howManySportsware.get(i)==0 && student_howManySportsware.get(i+1)==2){
                    student_howManySportsware.put(i,1);
                    student_howManySportsware.put(i+1,1);
                }else if(student_howManySportsware.get(i)==2 && student_howManySportsware.get(i+1)==0){
                    student_howManySportsware.put(i,1);
                    student_howManySportsware.put(i+1,1);
                }
            }
            else{// 앞 검사
                if(student_howManySportsware.get(i-1) == 0 && student_howManySportsware.get(i)==2){
                    student_howManySportsware.put(i,1);
                    student_howManySportsware.put(i+1,1);
                }else if(student_howManySportsware.get(i-1)==2 && student_howManySportsware.get(i)==0){
                    student_howManySportsware.put(i,1);
                    student_howManySportsware.put(i+1,1);
                }
            }

        }

        int count = n;
        for(int i =1;i<=n;i++){
            if(student_howManySportsware.get(i)==0)
                count--;
        }
        return count;

    }
}
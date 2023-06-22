import java.util.*;
class Solution {
    // 1 <= numbers.length <= 1000
    // 0 <= numbers[i] <= 9
    public String solution(int[] numbers, String hand) {


        LinkedHashMap<String, String> numkey_finger = new LinkedHashMap<>();
        for(int i=0;i<9;i++){
            numkey_finger.put(String.valueOf(i+1)," ");
        }
        numkey_finger.put("10","L");
        numkey_finger.put("0"," ");
        numkey_finger.put("12","R");

        StringBuilder sb = new StringBuilder();
        int[][] arr2D = new int[4][3];
        int count = 1;
        for(int i =0;i<4;i++){
            for (int j = 0; j < 3; j++) {
                arr2D[i][j] = count;
                count++;
            }
        }
        arr2D[3][1] = 0;
        int[] Lpos = {0,0};
        int[] Rpos = {0,0};
        int[] numpos = {0,0};

        int Lnum = 10;
        int Rnum = 12;
        for(int num : numbers){
            if(num == 1||num == 4||num == 7){
                sb.append("L");
                for (Map.Entry<String, String> entry : numkey_finger.entrySet()) {
                    if(entry.getValue().equals("L"))
                        entry.setValue(" ");
                }
                numkey_finger.put(String.valueOf(num),"L");
            }
            else if(num == 3||num == 6||num == 9){
                sb.append("R");
                for (Map.Entry<String, String> entry : numkey_finger.entrySet()) {
                    if(entry.getValue().equals("R"))
                        entry.setValue(" ");
                }
                numkey_finger.put(String.valueOf(num),"R");
            }
            else{
                //num -> 2,5,8,11
                // 거리 계산 로직 필요
                // 거리 같으면 입력 hand 사용
                for (Map.Entry<String, String> entry : numkey_finger.entrySet()) {
                    if(entry.getValue().equals("L")){
                        Lnum = Integer.parseInt(entry.getKey());
                        entry.setValue(" ");
                    }
                    if(entry.getValue().equals("R")){
                        Rnum = Integer.parseInt(entry.getKey());
                        entry.setValue(" ");
                    }
                }

                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 3; j++) {
                        if(arr2D[i][j]==Lnum){
                            Lpos[0]=i;
                            Lpos[1]=j;
                        }
                        if(arr2D[i][j]==Rnum){
                            Rpos[0]=i;
                            Rpos[1]=j;
                        }
                        if(arr2D[i][j]==num){
                            numpos[0]=i;
                            numpos[1]=j;
                        }
                    }
                }

                int R_diff_num = Math.abs(numpos[0]-Rpos[0]) + Math.abs(numpos[1]-Rpos[1]);
                int L_diff_num = Math.abs(numpos[0]-Lpos[0]) + Math.abs(numpos[1]-Lpos[1]);

                if(R_diff_num==L_diff_num){
                    if(hand.equals("right")) {
                        numkey_finger.put(String.valueOf(num), "R");
                        numkey_finger.put(String.valueOf(Lnum),"L");
                        sb.append("R");
                    }
                    else{
                        numkey_finger.put(String.valueOf(num),"L");
                        numkey_finger.put(String.valueOf(Rnum),"R");
                        sb.append("L");
                    }
                }else if(R_diff_num>L_diff_num){
                    numkey_finger.put(String.valueOf(num),"L");
                    numkey_finger.put(String.valueOf(Rnum),"R");
                    sb.append("L");
                }else{
                    numkey_finger.put(String.valueOf(num),"R");
                    numkey_finger.put(String.valueOf(Lnum),"L");
                    sb.append("R");
                }
            }

        }


        return sb.toString();
    }
}
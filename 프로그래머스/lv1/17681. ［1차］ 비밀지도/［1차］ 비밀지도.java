import java.util.Arrays;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] result = new String[n];
        for(int row = 0; row<n; row++){
            //arr1, arr2의 각 원소는 이진수로 변환시 행을 표현
            String bString1 = Integer.toBinaryString(arr1[row]);
            String bString2 = Integer.toBinaryString(arr2[row]);

            if(bString1.length()!=n){
                while(bString1.length()!=n){
                    bString1 = "0".concat(bString1);
                }
            }if(bString2.length()!=n){
                while(bString2.length()!=n){
                    bString2 = "0".concat(bString2);
                }
            }

            result[row] ="";
            for(int col=0; col<n; col++){
                if(Character.getNumericValue(bString1.charAt(col)) == 1
                    ||Character.getNumericValue(bString2.charAt(col)) == 1) {
                    result[row] = result[row].concat("#");
                }
                else if(Character.getNumericValue(bString1.charAt(col)) == 0
                        && Character.getNumericValue(bString2.charAt(col)) == 0){
                    result[row] = result[row].concat(" ");
                }
            }
        }
        return result;
    }
}
class Solution {
    public int solution(String dartResult) {

        String[] trys = {"","",""};

        int digit = 0;
        int nonDigit = 0;

        for(int i=0;i<dartResult.length();i++){
            if(i<=dartResult.length()-2){
                if(Character.isDigit(dartResult.charAt(i))&& Character.isDigit(dartResult.charAt(i+1)))
                {
                    trys[digit] += "10";
                    nonDigit = digit;
                    digit++;
                    i++;
                    continue;
                }
            }
            if(Character.isDigit(dartResult.charAt(i))){
                trys[digit] += dartResult.charAt(i);
                nonDigit = digit;
                digit++;
            }else{
                trys[nonDigit] += dartResult.charAt(i);
            }
        }

        int sum=0;

        int score_before = 0;
        boolean star_before = false;
        boolean sharp_before = false;

        for(int i =0;i<3;i++) {
            String each_try = trys[i];
            int score_given = 0;

            if (Character.isDigit(each_try.charAt(0)) && Character.isDigit(each_try.charAt(1))) {
                score_given = 10;
            } else
                score_given = Character.getNumericValue(each_try.charAt(0));

            int score_now = 0;

            if (score_given != 10){
                if (each_try.charAt(1) == 'S') {
                    score_now += score_given;
                }
                if (each_try.charAt(1) == 'D') {
                    score_now += score_given * score_given;
                }
                if (each_try.charAt(1) == 'T') {
                    score_now += score_given * score_given * score_given;
                }
                if (each_try.length() == 3 && each_try.charAt(2) == '*') {
                    if (star_before) {
                        sum += score_before * 2 + score_now * 2;
                    } else if (sharp_before) {
                        sum = sum - score_before + score_now * 2;
                    } else {
                        sum += score_before + score_now * 2;
                    }
                    star_before = true;
                } else star_before = false;

                if (each_try.length() == 3 && each_try.charAt(2) == '#') {
                    sum -= score_now;
                    sharp_before = true;
                } else sharp_before = false;

                if (each_try.length() == 2)
                    sum += score_now;
            }
            else if (score_given == 10){
                if (each_try.charAt(2) == 'S') {
                    score_now += score_given;
                }
                if (each_try.charAt(2) == 'D') {
                    score_now += score_given * score_given;
                }
                if (each_try.charAt(2) == 'T') {
                    score_now += score_given * score_given * score_given;
                }
                if (each_try.length() == 4 && each_try.charAt(3) == '*') {
                    if (star_before) {
                        sum += score_before * 2 + score_now * 2;
                    } else if (sharp_before) {
                        sum = sum - score_before + score_now * 2;
                    } else {
                        sum += score_before + score_now * 2;
                    }
                    star_before = true;
                } else star_before = false;

                if (each_try.length() == 4 && each_try.charAt(3) == '#') {
                    sum -= score_now;
                    sharp_before = true;
                } else sharp_before = false;

                if (each_try.length() == 3)
                    sum += score_now;
            }

            score_before = score_now;
        }

        return sum;
    }
}
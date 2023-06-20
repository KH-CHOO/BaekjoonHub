class Solution {
    // s가 나타내는 숫자 범위는 항상 int
    // s는 zero 또는 0으로 시작하지 않음
    // 1<=s.length()<=50
    public int solution(String s) {

        char[] ch = new char[s.length()];

        for(int i=0;i<s.length();i++){
            ch[i] = s.charAt(i);
        }

        int i=0;
        StringBuilder sb = new StringBuilder();
        while(i<ch.length) {
            if (Character.isDigit(ch[i])) {
                sb.append(ch[i]);
                i++;
            }
            else {
                if (ch[i] == 'z') {
                    sb.append('0');
                    i += 4;
                }else if(ch[i]=='o'){
                    sb.append('1');
                    i += 3;
                }else if(ch[i]=='t'&&ch[i+1]=='w'){
                    sb.append('2');
                    i += 3;
                }else if(ch[i]=='t'&&ch[i+1]=='h'){
                    sb.append('3');
                    i += 5;
                }else if(ch[i]=='f'&&ch[i+1]=='o'){
                    sb.append('4');
                    i+= 4;
                }else if(ch[i]=='f'&&ch[i+1]=='i'){
                    sb.append('5');
                    i+= 4;
                }else if(ch[i]=='s'&&ch[i+1]=='i'){
                    sb.append('6');
                    i+= 3;
                }else if(ch[i]=='s'&&ch[i+1]=='e'){
                    sb.append('7');
                    i+= 5;
                }else if(ch[i]=='e'){
                    sb.append('8');
                    i+= 5;
                }else{
                    sb.append('9');
                    i+= 4;
                }
            }
        }
        return Integer.parseInt(sb.toString());
    }
}
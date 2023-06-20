class Solution {
    public String solution(String s, int n) {

        char[] arr_ch = new char[s.length()];
        for(int i=0;i<s.length();i++){
            arr_ch[i] = s.charAt(i);
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr_ch.length;i++){
            if(arr_ch[i] == ' ')
                sb.append(' ');
            else {
                int arr_ch_ascii = arr_ch[i];
                if(arr_ch_ascii<=90){ // 대문자
                    if(arr_ch_ascii+n > 90){
                        int diff = 0;
                        diff = arr_ch_ascii + n - 90;
                        sb.append(Character.toChars(64+diff));
                    }else{
                        sb.append(Character.toChars(arr_ch_ascii+n));
                    }
                }else{
                    if(arr_ch_ascii + n > 122){
                        int diff = 0;
                        diff = arr_ch_ascii + n - 122;
                        sb.append(Character.toChars(96+diff));
                    }else{
                        sb.append(Character.toChars(arr_ch_ascii+n));
                    }
                }
            }
        }
        return sb.toString();
    }
}
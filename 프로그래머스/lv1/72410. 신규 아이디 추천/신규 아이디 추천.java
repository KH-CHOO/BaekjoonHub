class Solution {
    public String solution(String new_id) {

        String step1 = new_id.toLowerCase();
        String step2 = step1.replaceAll("[^a-z0-9-_.]","");
        String step3 = step2.replaceAll("\\.+",".");

        //step4
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<step3.length(); i++){
            char c = step3.charAt(i);
            if (i == 0 && c == '.') {
                continue; // Skip appending
            }
            if (i == step3.length() - 1 && c == '.') {
                continue; // Skip appending
            }
            sb.append(c);
        }

        //step5
        String temp = sb.toString();
        if(temp.isEmpty())
            sb.append("a");

        //step6
        if(sb.length()>=16){
            sb.delete(15, sb.length());
            if(sb.charAt(sb.length()-1)=='.')
                sb.delete(sb.length()-1,sb.length());
        }

        //step7
        if (sb.length() <= 2) {
            char lastChar = sb.charAt(sb.length() - 1);
            while(sb.length()!=3){
                sb.append(lastChar);
            }
        }
        System.out.println("return");
        return sb.toString();
    }
}
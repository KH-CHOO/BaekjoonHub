
class Solution {
    public int[] solution(long n) {

        String s = Long.toString(n); // String is an immutable class
        StringBuilder r = new StringBuilder(s); 
        // StringBuilder, on the other hand, 
        // is a mutable class specifically designed for efficient string manipulation
        r.reverse();
        
        int[] n_a = new int[r.length()];
        
        for (int i = 0; i < r.length(); i++) {
            char ch = r.charAt(i);
            int d = Character.getNumericValue(ch);
            n_a[i] = d;
        }
        return n_a;
    }
}
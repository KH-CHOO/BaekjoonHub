import java.util.*;

public class Solution {
    public int solution(int n) {
        String stringNumber = Integer.toString(n);
int sum = 0;

for (int i = 0; i < stringNumber.length(); i++) {
    int digit = Character.getNumericValue(stringNumber.charAt(i));
    sum += digit;
}return sum;
    }
}
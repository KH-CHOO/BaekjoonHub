class Solution {
    /*    new_id는 길이 1 이상 1,000 이하인 문자열입니다.
        new_id는 알파벳 대문자, 알파벳 소문자, 숫자, 특수문자로 구성되어 있습니다.
        new_id에 나타날 수 있는 특수문자는 -_.~!@#$%^&*()=+[{]}:?,<>/ 로 한정됩니다.*/
    public String solution(String new_id) {
        // Step 1: Convert to lowercase
        String step1 = new_id.toLowerCase();

        // Step 2: Remove invalid characters
        String step2 = step1.replaceAll("[^-_.a-z0-9]", "");

        // Step 3: Replace consecutive dots with a single dot
        String step3 = step2.replaceAll("[.]{2,}", ".");

        // Step 4: Remove leading and trailing dots
        String step4 = step3.replaceAll("^[.]|[.]$", "");

        // Step 5: If empty, assign "a"
        if (step4.isEmpty()) {
            step4 = "a";
        }

        // Step 6: Truncate to 15 characters and remove trailing dot
        if (step4.length() >= 16) {
            step4 = step4.substring(0, 15);
            step4 = step4.replaceAll("[.]$", "");
        }

        // Step 7: Repeat last character until length is 3
        while (step4.length() <= 2) {
            step4 += step4.charAt(step4.length() - 1);
        }

        return step4;
    }
}
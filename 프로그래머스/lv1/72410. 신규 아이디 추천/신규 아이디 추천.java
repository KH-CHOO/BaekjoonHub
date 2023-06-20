class Solution {
    public String solution(String new_id) {
        // Step 1: Convert to lowercase
        String step1 = new_id.toLowerCase();

        // Step 2: Remove invalid characters
        String step2 = step1.replaceAll("[^a-z0-9-_.]","");

        // Step 3: Replace consecutive dots with a single dot
        String step3 = step2.replaceAll("\\.{2,}", ".");

        // Step 4: Remove leading and trailing dots
        String step4 = step3.replaceAll("^\\.|\\.$", "");

        // Step 5: If empty, assign "a"
        if (step4.isEmpty()) {
            step4 = "a";
        }

        // Step 6: Truncate to 15 characters and remove trailing dot
        if (step4.length() >= 16) {
            step4 = step4.substring(0, 15);
            step4 = step4.replaceAll("\\.$", "");
        }

        // Step 7: Repeat last character until length is 3
        if (step4.length() <= 2) {
            char lastChar = step4.charAt(step4.length() - 1);
            while (step4.length() < 3) {
                step4 += lastChar;
            }
        }

        return step4;
    }
}
class Solution {
    public String solution(String s) {
        StringBuilder result = new StringBuilder();
        boolean capitalize = true; // Flag to determine whether to capitalize or not
        
        for (char c : s.toCharArray()) {
            if (Character.isWhitespace(c)) {
                result.append(c); // Add whitespace to the result
                capitalize = true; // Reset the capitalize flag for the next word
            } else {
                if (capitalize) {
                    result.append(Character.toUpperCase(c)); // Capitalize the character
                } else {
                    result.append(Character.toLowerCase(c)); // Convert the character to lowercase
                }
                
                capitalize = !capitalize; // Toggle the capitalize flag
            }
        }
        
        return result.toString();
    }
}

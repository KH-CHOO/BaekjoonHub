

 import java.util.Arrays;
 import java.util.Comparator;

class Solution {

    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new CharComparator(n));
		return strings;
    }
}

class CharComparator implements Comparator<String>{
	private int index;
	public CharComparator(int index){
		this.index = index;
	}
	
	@Override
	public int compare(String s1, String s2){
		char c1 = s1.charAt(index);
		char c2 = s2.charAt(index);
		if (c1 == c2) {
            return s1.compareTo(s2); 
			// Sort lexicographically when characters are the same
        }
		return Character.compare(c1,c2);
	}


}
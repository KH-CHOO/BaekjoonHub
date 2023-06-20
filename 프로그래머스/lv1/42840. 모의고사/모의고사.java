class Solution {
    public int[] solution(int[] answers) {
        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};
		
		int[] abc_index = {0,0,0};
		int[] same_count = {0,0,0};
		
		for(int i =0;i<answers.length;i++){
			if(abc_index[0]==5)
				abc_index[0] = 0;
			if(abc_index[1]==8)
				abc_index[1] = 0;
			if(abc_index[2]==10)
				abc_index[2] = 0;	
			if(a[abc_index[0]] == answers[i])
				same_count[0]++;
			if(b[abc_index[1]] == answers[i])
				same_count[1]++;
			if(c[abc_index[2]] == answers[i])
				same_count[2]++;
			abc_index[0]++;
			abc_index[1]++;
			abc_index[2]++;
		}
		int a_count = same_count[0];
		int b_count = same_count[1];
		int c_count = same_count[2];
		if(a_count == b_count && b_count == c_count)
			return new int[]{1,2,3};
		else if(a_count == b_count){
			if(c_count > a_count)
				return new int[]{3};
			else
				return new int[]{1,2};
		}else if(a_count == c_count){
			if(b_count > a_count)
				return new int[]{2};
			else
				return new int[]{1,3};	
		}else if(b_count == c_count){
			if(a_count > b_count)
				return new int[]{1};
			else
				return new int[]{2,3};
		}else{
			int max = Math.max(a_count,Math.max(b_count,c_count));
			if(max==a_count)
				return new int[]{1};
			else if(max==b_count)
				return new int[]{2};
			else
				return new int[]{3};
		}
			

	}
		
}

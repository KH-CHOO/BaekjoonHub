/*
1부터 45까지의 숫자 중 6개
순서와 상관없이, 
구매한 로또에 당첨 번호와 일치하는 번호가 있으면 맞힌 걸로 인정됩니다.

1	6개 번호가 모두 일치
2	5개 번호가 일치
3	4개 번호가 일치
4	3개 번호가 일치
5	2개 번호가 일치
6(낙첨)	그 외

lottos는 길이 6인 정수 배열입니다.
win_nums도 길이 6인 정수 배열입니다.

lottos의 모든 원소는 0 이상 45 이하인 정수입니다.
0은 알아볼 수 없는 숫자를 의미합니다.
win_nums의 모든 원소는 1 이상 45 이하인 정수입니다.

0을 제외한 다른 숫자들은 lottos에 2개 이상 담겨있지 않습니다.
win_nums에도 같은 숫자가 2개 이상 담겨있지 않습니다.
-> 0 제외하면 중복 숫자는 없다

lottos의 원소들은 정렬되어 있지 않을 수도 있습니다.
win_nums의 원소들은 정렬되어 있지 않을 수도 있습니다.

*/
// import java.util.ArrayList;
class Solution {
	//구매한 로또 번호를 담은 배열 lottos
	//당첨 번호를 담은 배열 win_nums
	//당첨 가능한 최고 순위와 최저 순위를 차례대로 배열에 담아서 return
	//ex [1,5]
    public int[] solution(int[] lottos, int[] win_nums) {
        
		// ArrayList<Integer> same_nums = new ArrayList<>();
		
		int zeros_count = 0;// lottos에서 0이 몇 개인지
		int same_num_count = 0;// lottos에서 당첨 숫자 몇개인지
		int fail_num_count = 0;// lottos에서 0이 아니면서 틀린 숫자
		for(int lotto_num:lottos){
			if(lotto_num == 0)
				zeros_count ++;
			else{
				for(int win_num:win_nums){
					if(lotto_num==win_num){//당첨 숫자 저장 시도
						// same_nums.add(lotto_num);
						same_num_count++;
					}
					else{
						fail_num_count++;
					}
				}
			}
		}
		
		if(zeros_count == 6)
			return new int[]{1,6};
		
		if(zeros_count ==0 && same_num_count == 0)
			return new int[]{6,6};
		
		if(zeros_count ==0 && same_num_count == 6)
			return new int[]{1,1};

		return new int[]{7-same_num_count-zeros_count, 7-same_num_count};
    }
	
}
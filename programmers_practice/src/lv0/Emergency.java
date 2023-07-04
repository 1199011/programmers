package lv0;

import java.util.Arrays;

//외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다. 
//정수 배열 emergency가 매개변수로 주어질 때 응급도가 높은 순서대로 진료 순서를 정한 배열을 
//return하도록 solution 함수를 완성해주세요.

public class Emergency {
	    public int[] solution(int[] emergency) {
	        int[] answer = new int[emergency.length];
	        
	        for(int i = 0; i <emergency.length;i++) {
	        	int rank = 1;
	        	
	        	for(int j = 0; j < emergency.length; j++) {
	        		if(emergency[i] < emergency[j]) {
	        			rank++;
	        		}
	        	}
	        	answer[i] = rank;
	        }
	        return answer;
	    }
	public static void main(String[] args) {
		int[] arr = {30, 10, 23, 6, 100};
		Emergency emergency = new Emergency();
		System.out.println(Arrays.toString(emergency.solution(arr)));
	}

}

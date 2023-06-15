package lv0;

import java.util.Random;

//정수가 담긴 리스트 num_list가 주어질 때, num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
//1 ≤ num_list의 길이 ≤ 100
//0 ≤ num_list의 원소 ≤ 1,000

//public int[] solution(int[] num_list) {
//    int[] answer = new int[2];
//
//    for(int i = 0; i < num_list.length; i++)
//        answer[num_list[i] % 2]++;
//
//    return answer;
//}


public class EvenOddNumber {
	
	public int[] solution(int[] num_list) {
		int[] answer = new int[2];
		int even = 0;
		int odd = 0;
		
		for(int i=0; i < num_list.length; i++) {
			if(num_list[i]%2 ==0 && num_list[i] !=0) { // 0일 경우를 제외하기위해 num_list[i] !=0를 사용했음
				even++;
			}else if(num_list[i]%2 ==1) {
				odd++;
			}
		}
			answer[0]=even;
			answer[1]=odd;
			
			return answer;
		
	}
	public static void main(String[] args) {
		Random random = new Random();
		EvenOddNumber eon = new EvenOddNumber();
		
		int randIndex = random.nextInt(101);
		
		int[] num_list = new int[randIndex];
		
		for(int i= 0; i < randIndex; i++) {
			int randValue = random.nextInt(1000);
			num_list[i] = randValue;
		}
		
		
		eon.solution(num_list);
		
	}

}

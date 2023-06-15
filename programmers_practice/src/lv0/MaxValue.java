package lv0;

import java.util.Random;

//정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
//0 ≤ numbers의 원소 ≤ 10,000
//2 ≤ numbers의 길이 ≤ 100
/*
class Solution {
    public int solution(int[] numbers) {
		int maxValue1 = 0;
		int maxValue2 = 0;
		int maxValue = 0;
		
		if (numbers.length >= 2 && numbers.length <= 100) {

			for (int number : numbers) {
				if (maxValue1 < number) {
					maxValue2 = maxValue1;
					maxValue1 = number;

				} else if (maxValue2 < number) {
					maxValue2 = number;

				}

			}
		}
		System.out.println("최고값1 = "+maxValue1+", 최고값2 = "+maxValue2);
		maxValue = maxValue1 * maxValue2;
		return maxValue;
    }
}
*/

//import java.util.*;
//
//class Solution {
//    public int solution(int[] numbers) {
//        int answer = 0;
//
//        Arrays.sort(numbers);
//
//        return numbers[numbers.length-1]*numbers[numbers.length-2];
//    }
//}

public class MaxValue {

	public int maxValue(int numbers[]) {
		int maxValue1 = 0;
		int maxValue2 = 0;
		int maxValue = 0;
		
		if (numbers.length >= 2 && numbers.length <= 100) {

			for (int number : numbers) {
				if (maxValue1 < number) {
					maxValue2 = maxValue1;
					maxValue1 = number;

				} else if (maxValue2 < number) {
					maxValue2 = number;

				}

			}
		}
		System.out.println("최고값1 = "+maxValue1+", 최고값2 = "+maxValue2);
		maxValue = maxValue1 * maxValue2;
		return maxValue;
		
	}

	public static void main(String[] args) {
		Random random = new Random();
		MaxValue mv = new MaxValue();

		int randIndex = random.nextInt(101) + 2;

		int[] number = new int[randIndex];

		for (int i = 0; i < randIndex; i++) {
			int randValue = random.nextInt(10001);
			number[i] = randValue;
		}

		int value = mv.maxValue(number);
		System.out.println("곱하기 = "+value);

	}

}




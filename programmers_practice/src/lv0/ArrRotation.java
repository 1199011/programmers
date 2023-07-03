package lv0;

//정수가 담긴 배열 numbers와 문자열 direction가 매개변수로 주어집니다. 
//배열 numbers의 원소를 direction방향으로 한 칸씩 회전시킨 배열을 return하도록 solution 함수를 완성해주세요.
//direction은 "left" 와 "right" 둘 중 하나입니다.
public class ArrRotation {

	public int[] solution(int[] numbers, String direction) {
		int[] answer = new int[numbers.length];

		if (direction.equals("right")) {
			int lastNum = numbers[numbers.length -1];

			System.arraycopy(numbers, 0, answer, 1, numbers.length - 1);
			answer[0] = lastNum;

		} else if (direction.equals("left")) {

			int firstNum = numbers[0];

			System.arraycopy(numbers, 1, answer, 0, numbers.length - 1);
			answer[numbers.length - 1] = firstNum;
		}
		return answer;
	}

	public static void main(String[] args) {
	}
}

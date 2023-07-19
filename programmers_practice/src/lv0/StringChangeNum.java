package lv0;
//영어가 싫은 머쓱이는 영어로 표기되어있는 숫자를 수로 바꾸려고 합니다. 
//문자열 numbers가 매개변수로 주어질 때, 
//numbers를 정수로 바꿔 return 하도록 solution 함수를 완성해 주세요.

//replaceAll하면 엄청 쉽게 풀린다
public class StringChangeNum {

	  public long solution(String numbers) {
			long answer = 0;
			String[] arr = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

			int i = 0;
			while (i < arr.length) {
				if (numbers.startsWith(arr[i])) {
					answer = answer * 10 + i;
					numbers = numbers.substring(arr[i].length());
					i = 0;
				} else {
					i++;
				}
			}

			return answer;
		}
	
	public static void main(String[] args) {

		String numbers = "onefourzerosixseven";
		
		StringChangeNum scn = new StringChangeNum();
		scn.solution(numbers);
		
	}

}

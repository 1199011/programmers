package lv0;
//머쓱이는 친구에게 모스부호를 이용한 편지를 받았습니다. 
//그냥은 읽을 수 없어 이를 해독하는 프로그램을 만들려고 합니다. 
//문자열 letter가 매개변수로 주어질 때, letter를 영어 소문자로 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
//모스부호는 다음과 같습니다.

//letter의 모스부호는 공백으로 나누어져 있습니다.
public class Morse {
	public String solution(String letter) {
		String answer = "";
		String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
		String[] stringMorse = letter.split(" "); // 공백으로 나눠서 배열에 저장

		StringBuilder sb = new StringBuilder();

		for (String temp : stringMorse) {
			for (int i = 0; i < morse.length; i++) {
				if (morse[i].equals(temp)) {
					sb.append(Character.toString(i + 'a')); //Character.toString은 유니코드 값을 문자로 바꿔준다
				}
			}
		}
		answer = sb.toString();
		return answer;
	}
}

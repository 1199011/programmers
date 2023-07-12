package lv0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//문자열 my_string이 매개변수로 주어질 때, 
//my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.


public class StringSort {

//	public int[] solution(String my_string) {
//        StringBuilder tempString = new StringBuilder();
//        
//        for(char temp : my_string.toCharArray()) {
//        	if(temp >= '0' && temp <= '9') {
//        	tempString.append(temp);
//        	}
//        }
//        int[] answer = new int[tempString.length()];
//        
//        for(int i = 0; i < tempString.length(); i++) {
//        	answer[i] = tempString.charAt(i)-'0';
//        }
//        Arrays.sort(answer);
//        return answer;
//    }
	
	public List<Integer> solution(String my_string) {
		List<Integer> answer = new ArrayList<Integer>();
		
		for(char temp : my_string.toCharArray()) {
			if(temp >= '0' && temp <= '9') {
				
				answer.add(temp-'0');
			}
		}
		Collections.sort(answer);
		return answer;
	}
	
	public static void main(String[] args) {

		String s = "hi12392";
		StringSort ss = new StringSort();
		ss.solution(s);
		
	}

}

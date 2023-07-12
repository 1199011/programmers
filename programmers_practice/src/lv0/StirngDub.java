package lv0;

import java.util.HashSet;
import java.util.Set;

//문자열 my_string이 매개변수로 주어집니다.
//my_string에서 중복된 문자를 제거하고 하나의 문자만 남긴 문자열을 
//return하도록 solution 함수를 완성해주세요.

public class StirngDub {

	 public String solution(String my_string) {
	        String answer = "";
	        
	        Set<Character> set = new HashSet<Character>();
	        StringBuilder sb = new StringBuilder();
	        
	        for(char temp : my_string.toCharArray()) {
	        	if(set.add(temp)) {
	        		sb.append(temp);
	        	}
	        }
	        answer = sb.toString();
	        
	        return answer;
	    }
	
}

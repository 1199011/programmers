package lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//문자열 s가 매개변수로 주어집니다. 
//s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return 하도록 
//solution 함수를 완성해보세요. 
//한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.

public class RemoveDubAndSort {
    public String solution(String s) {
        String answer = "";
        Set<String> set = new HashSet<String>();
        List<String> list = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();
        char[] sortArr = s.toCharArray();
        
        Arrays.sort(sortArr);
        
        for(char c : sortArr) {
        	if(sb.indexOf(String.valueOf(c))==-1) {
        		sb.append(c);
        	}else if(set.add(String.valueOf(c))){
        		list.add(String.valueOf(c));
        	}
        }
        
        answer = sb.toString();
        
        for(int i = 0; i < list.size(); i++) {
        	answer = answer.replace(list.get(i),"");
        			
        }
        
        
        
        return answer;
    }
	
	public static void main(String[] args) {

	}

}

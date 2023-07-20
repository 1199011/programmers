package lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

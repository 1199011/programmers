package lv0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//정수 n이 매개변수로 주어질 때, n의 약수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.

public class Sqrt {
    public int[] solution(int n) {
        int sqrt = (int)Math.sqrt(n);
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i = 1; i <= sqrt; i++ ) {
        	if(n % i == 0) {
        		list.add(i);
        		
        		if(n / i != i) {
        			list.add(n / i);
        		}
        	}
        }
        
        Collections.sort(list);
        int[] answer = new int[list.size()];
        int j = 0;
        for(int temp : list) {
        	
        	
        	answer[j] = temp;
        	j++;
        }
        
        return answer;
    }
}

package lv0;

import java.util.ArrayList;
import java.util.List;

//정수 n과 정수 배열 numlist가 매개변수로 주어질 때, numlist에서 n의 배수가 아닌 수들을 제거한 배열을 return하도록 solution 함수를 완성해주세요.

public class ArrMultiple {
	
//public int[] solution(int n, int[] numlist) {
//        
//        int count = 0;
//        int i =0;
//        for(int temp : numlist){
//            if((temp%n) == 0){
//                count++;
//            }
//        }
//        
//        int[] answer = new int[count];
//        
//        for(int temp : numlist){
//            if((temp%n) == 0){
//                answer[i] = temp;
//                i++;
//            }
//        }
//        
//        return answer;
//    }
	
	
	 public List<Integer> solution(int n, int[] numlist) {
	        
	        List<Integer> list = new ArrayList<>();
	        
	        for(int temp : numlist){
	            if((temp%n) == 0){
	                list.add(temp);
	            }
	        }
	        
	        return list;
	    }
	 
	public static void main(String[] args) {

		ArrMultiple am = new ArrMultiple();
		int[] arr = {4, 5, 6, 7, 8, 9, 10, 11, 12};
		am.solution(3, arr);
		
	}

}

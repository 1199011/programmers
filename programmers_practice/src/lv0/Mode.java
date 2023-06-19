package lv0;

import java.util.Arrays;

//최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 
//정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요. 
//최빈값이 여러 개면 -1을 return 합니다.

//public int solution(int[] array) {
//    int maxCount = 0;
//    int answer = 0;
//    Map<Integer, Integer> map = new HashMap<>();
//    for(int number : array){
//        int count = map.getOrDefault(number, 0) + 1;
//        if(count > maxCount){
//            maxCount = count;
//            answer = number;
//        }
//        else  if(count == maxCount){
//            answer = -1;
//        }
//        map.put(number, count);
//    }
//    return answer;
//}



public class Mode {

	public int mode(int[] array) {
		  int answer = 0;
		  
		  Arrays.sort(array);
		  //오름차순으로 정렬 후 제일 높은 숫자 max
		  int max = array[array.length-1];
		  
		  //최빈값 배열에 삽입
		  int[] count = new int[max+1];
		  for(int ct : array) {
			  count[ct]++;
		  }
		  
		  //최빈값 구하기, 중복시 -1 반환
		  int high = count[0];
		  
		  for(int i = 1; i < max+1; i++) {
			  if(count[i] > high) {
				  high = count[i];
				  answer = i;
			  }else if(high == count[i]) {
				  answer = -1;
			  }
		  }
	        return answer;
	}
	
	public static void main(String[] args) {

		int[] array = new int[]{1, 1, 2, 2};
		Mode mode = new Mode();
		int result = mode.mode(array);
        System.out.println(result);
	}

}

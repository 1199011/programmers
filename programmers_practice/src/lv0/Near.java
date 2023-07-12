package lv0;

//정수 배열 array와 정수 n이 매개변수로 주어질 때, 
//array에 들어있는 정수 중 n과 가장 가까운 수를 return 하도록 
//solution 함수를 완성해주세요.
//거리가 같으면 작은 수를 return

public class Near {


    public int solution(int[] array, int n) {
        int answer = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++){
            int temp = Math.abs(n - array[i]); // 절대값으로 근사값 구하기
            
            if(temp < min){
                min = temp;
                answer = array[i];
            }else if(temp == min && answer > array[i]){ //작은 수 찾기
                answer = array[i];
            }
        }

        return answer;
    }
}
	


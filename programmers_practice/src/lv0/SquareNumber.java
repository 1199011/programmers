package lv0;

//어떤 자연수를 제곱했을 때 나오는 정수를 제곱수라고 합니다. 정수 n이 매개변수로 주어질 때,
//n이 제곱수라면 1을 아니라면 2를 return하도록 solution 함수를 완성해주세요.

//소수는 약수의 개수가 두 개 ( 1 과 자기 자신)
//소수의 제곱은 약수의 개수가 3
//제곱수는 약수의 개수가 홀수개
//제곱수가 아닌 수의 약수의 개수는 쌍으로 존재하므로 짝수개


public class SquareNumber {
	
	 public int squareNumber(int n) {
	        int answer = 0;
	        double x = Math.sqrt(n);
	        
	        if(x%1!=0) {
	        	answer = 2;
	        }else {
	        	answer = 1;
	        }
	        
	        return answer;
	    }

	public static void main(String[] args) {

	}

}

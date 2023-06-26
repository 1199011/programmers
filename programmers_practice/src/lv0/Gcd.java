package lv0;

//첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다.
//두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.

public class Gcd {
	
	public int gcdNumber(int a, int b) {
		while(b != 0) {
			int r = a%b;
			a = b;
			b = r;
		}
		return a; // 최대 공약수
	}

	 public int[] solution(int numer1, int denom1, int numer2, int denom2) {
	        int[] answer = new int[2];
	        int numer = numer1*denom2+numer2*denom1;
	        int denom = denom1*denom2;
	        
	        int gcd = gcdNumber(numer,denom);
	     
	        answer[0] = numer/gcd;
	        answer[1] = denom/gcd;
	        return answer;
	    }
	
	public static void main(String[] args) {
		
	}

}

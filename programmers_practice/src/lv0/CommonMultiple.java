package lv0;

//머쓱이네 피자가게는 피자를 여섯 조각으로 잘라 줍니다. 피자를 나눠먹을 사람의 수 n이 매개변수로 주어질 때, 
//n명이 주문한 피자를 남기지 않고 모두 같은 수의 피자 조각을 먹어야 한다면 최소 몇 판을 시켜야 하는지를 
//return 하도록 solution 함수를 완성해보세요.


public class CommonMultiple {
	public int gcd(int a, int b) { // 유클리드 호제법
		while(b != 0) {
			int r = a%b;
			a = b;
			b = r;
		}
		return a; // 최대 공약수
	}
	
	public int solution(int n) {
		int answer = 0;
        int max = 0;
		max = gcd(n,6);
		
		answer = ((n*6)/max)/6; // 최소 공배수
		
        return answer;
	}

	public static void main(String[] args) {

	}

}

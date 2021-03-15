package sugang0312;
// 자신 앞에 있는 소수로 나누는 방법으로 소수 판별해서 출력하기
public class Qus_3gang {
	public static void main(String[] args) {

		// 소수만 기억할 수 있는 배열은 만듦, 몇 개짜리 배열을 만들지 모름.. 넉넉하게 잡아보자

		int[] prime = new int[30]; // 소수가 들어오면 이 배열의 0번째 부터 들어감
		int loc = 0;

		for (int num = 2; num <= 100; num++) {
			boolean flag = true;
			for (int i = 0; i < loc; i++) {
				if (num % prime[i] == 0) { // 약수가 존재할 때,flag를 false로 변경해서 배열에 num이 입력 안되도록함
					flag = false;
					break;
				}
			}
			if (flag) {
				prime[loc++] = num; // loc 증가 (배열의 인덱스 이동)
			}
		}

		for (int i = 0; i < loc; i++) {
			System.out.println(prime[i] + " ");
			if ((i + 1) % 5 == 0) {
				System.out.println();
			}
		}

	}
}

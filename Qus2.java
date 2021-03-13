package sugang0312;

import java.util.Arrays;
import java.util.Scanner;

public class Qus2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i = 0;
		int n = 1;
		int cnt_even = 0;
		int cnt_odd = 0;

		System.out.println("짝수 몇 개 입력? :");
		int even = sc.nextInt(); // 출력하고싶은 짝수의 개수

		System.out.println("홀수 몇 개 입력? :");
		int odd = sc.nextInt(); // 출력하고 싶은 홀수의 개수

		int[] Arr = new int[even + odd];
		int[] B_Arr = new int[even];
		int[] C_Arr = new int[odd];

		while (i < Arr.length) {
			System.out.println("num" + n + ":");
			int num = sc.nextInt();
			n++;

			if (even > 0 && num % 2 == 0) {
				B_Arr[cnt_even] = num; // for문 없이 B_Arr[0], B_Arr[1], B_Arr[2] ~순으로 배열의 값을 채워줌
				cnt_even++;

			} else if (odd > 0 && num % 2 != 0) {
				C_Arr[cnt_odd] = num;
				cnt_odd++;
			}
			i++; // 처음에 빼먹은 부분, while(i < Arr.length)의 종료를 위해 반드시 필요
		}
		System.out.println("<P R I N T>");

		for (int j = 0; j < B_Arr.length; j++) { // 두 배열을 합치기 위해 전체 배열 A_rr에 B,C를 합해서 출력
			Arr[j] = B_Arr[j];  // 처음에 Arr[j] += B_Arr[j]; 로 했는데, +=할 필요없음
			for (int k = 0; k < C_Arr.length; k++) { // B가 들어간 전체 배열에 C 넣기
				Arr[B_Arr.length + k] = C_Arr[k]; //  B.length B의 사이즈부터 시작하면, 인덱스 시작이 B가 모두 들어간 이후 부터임, 그리고 Arr[B_Arr.length + k] 처음에 +k하는거 깜빡함
			}									  // 그리고 Arr[B_Arr.length + k] 처음에 +k하는거 깜빡함, 인덱스가 이동되어야 하니까..
		}
		System.out.println(Arrays.toString(Arr));
	}
}
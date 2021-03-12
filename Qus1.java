package sugang0312;

import java.util.Arrays;
import java.util.Scanner;

public class Qus1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] Arr = new int[5];
		String[] RArr = new String[5];

		int i = 0;
		int n = 1;

		while (i < Arr.length) {
			System.out.println(n + "'s 정수 ;");
			Arr[i] = sc.nextInt();
			if (Arr[i] >= 0 && Arr[i] <= 99) {
				n++;
				i++;
			} else {
				System.out.println("0~99 사이의 정수를 입력하세요. ");
			}
		}
		System.out.println(Arrays.toString(Arr));

		String Tens = " "; // 선언이 반복되면 안됨 (처음에 반복문에 넣었다가 뺏음) (내가 자주하는 실수)
		String Digit = " ";

		for (int j = 0; j < Arr.length; j++) {

			Tens = Integer.toString(Arr[j] / 10); // 십의 자릿 수

			Digit = Integer.toString(Arr[j] - (Arr[j] / 10) * 10); // 일이 자릿 수

			RArr[Arr.length - (j + 1)] = Digit + Tens; // 스트링 배열
		}
		System.out.println(Arrays.toString(RArr)); // 출력문은 반복문 바깥으로... (내가 자주하는 실수)
	}
}

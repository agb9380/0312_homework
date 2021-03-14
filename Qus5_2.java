package sugang0312;

import java.util.Scanner;

public class Qus5_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("3~20사이의 정수를 입력하세요: ");
		int input = sc.nextInt();

		if (input % 2 == 0) {
			input--;
		}

		for (int i = 1; i <= input; i++) {
			if (i < (input / 2 + 1)) {
				for (int j = input / 2 + 1; j > 0; j--) {
					if (i <= j) {
						System.out.print('*');
					}
				}
			} else if (i == input / 2 + 1) {
				System.out.print('*');
			} else if (i > (input / 2)) {
				for (int j = 1; j <= (input / 2) + 1; j++) {
					if (j <= i - (input / 2)) {
						System.out.print("*");
					}
				}
			}System.out.println();

		}
	}
}
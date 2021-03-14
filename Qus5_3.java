package sugang0312;

import java.util.Scanner;

public class Qus5_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("3~20 사이의 정수를 입력하세요: ");
		int input = sc.nextInt();

		if (input % 2 == 0) {
			input--;
		}

		for (int i = 1; i <= input; i++) {
			if (i < (input / 2 + 1)) {
				for (int j = 1; j < input / 2 + 1; j++) {
					if (i > j)
						System.out.print(" ");
				}
				for (int j = input - ((i - 1) * 2); j > 0; j--) {
					System.out.print("*");
				}

			} else if (i == input / 2 + 1) {
				for (int k = 0; k < i - 1; k++) {
					System.out.print(" ");
				}
				System.out.print('*');
			} else if (i > (input / 2 + 1)) {
				for (int l = 1; l <= input - i; l++) {
					System.out.print(" ");
				}
				for (int l = 0; l < 2 * (i - (input / 2 + 1)) + 1; l++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}

package sugang0312;

import java.util.Scanner;

public class Qus5_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("3~20 사이의 정수를 입력하세요: ");
		int input = sc.nextInt();

		for (int i = 1; i <= input; i++) {

			for (int j = input; j > 0; j--) { 
				if (i < j) {			// 입력한 수보다 1작은 '-' 출력 ex) i=1일 때, j=input=5일 때, 5,4,3,2 4번 돌아감 (j--), i는 행이라는것을 기억
					System.out.print('-');
				} else if (i>= j) { 	// 입력한 수가 i와 같거나 작은 경우에는 별표 출력
					System.out.print('*'); 
				}
			}System.out.println();
		}
	}
}

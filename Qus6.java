package sugang0312;

import java.util.Random;
import java.util.Scanner;

public class Qus6 {

	public static void main(String[] args) {
		Random r = new Random();
		int randomNum = r.nextInt(100) + 1; // 0~100의 수 중 랜덤으로 선택
		Scanner sc = new Scanner(System.in);
		int i = 5; // 5번의 기회가 주어짐
	
		int start =1;
		int end =100;
		
		while (true) {
			i--; // 기회는 감소, 그런데 범위를 벗어난 값을 입력해도 기회가 줄어들지 않을까? 그래서 19행에 다시 기회 ++ 시켜주었음
			System.out.println(start + "~" + end + ":");
			int input = sc.nextInt();
			if (input < 0 || input > 101) {
				i++; // 범위를 벗어난 값을 입력하더라도 기회가 사라지는게 아니기 때문임
				System.out.println("범위를 벗어났습니다. 1~100 사이의 수를 입력해주세요.");
			}

			else if (randomNum < input) {
				System.out.println(input + "보다 작은 수 입니다.");
				System.out.println("기회는" + i + "번 남았습니다.");
				//System.out.println("1~" + (input - 1)); 초반에 생각했던 것, 입력하고 값을 바로 보여주려고함, 그런데 입력값 input 하나로 여러 번 사용해야함, 처음에 input2, input3이런식으로 사용함..
				end = input-1;

				if (input < 0 || input > 101) {
					i++;
					System.out.println("1~100사이의 수를 입력해주세요. ");
				}
			} else if (randomNum > input) {
				System.out.println(input + "보다 큰 수 입니다.");
				System.out.println("기회는" + i + "번 남았습니다.");
				//System.out.println((input + 1) + "~100: ");
				start = input +1;

				if (input < 0 || input > 101) {
					i++;
					System.out.println("1~100사이의 수를 입력해주세요. ");
				}

			} else if (input == randomNum) {
				System.out.println("정답입니다.");
				break;

			}
			if (i == 0) {
				if (randomNum != input) {
					System.out.println("아쉽습니다.. 기회를 다 소진하셨습니다");
					System.out.println("정답은" + randomNum);
					break;
				}
			}

		}
	}
}

/*
 * while (i > 0) { if (randomNum > input) { System.out.println(input +
 * "보다 큰 수 입니다."); System.out.println("기회는" + i + "번 남았습니다.");
 * System.out.println((input + 1) + "~100: "); int input2 = sc.nextInt();
 * 
 * if (randomNum == input2) { System.out.println("정답입니다."); break; } else if
 * (randomNum > input2) { System.out.println(input2 + "보다 큰 수 입니다.");
 * System.out.println("기회는" + i + "번 남았습니다."); System.out.println((input2 + 1) +
 * "~100: "); int input3 = sc.nextInt();
 * 
 * if (randomNum == input3) { System.out.println("정답입니다."); } else {
 * System.out.println("아쉽습니다.. 기회를 다 소진하셨습니다"); System.out.println("정답은" +
 * randomNum); }
 * 
 * }
 * 
 * } else if (randomNum < input) { System.out.println(input + "보다 작은 수 입니다.");
 * System.out.println("기회는" + i + "번 남았습니다."); System.out.println("1~" + (input
 * - 1)); int input2 = sc.nextInt();
 * 
 * if (randomNum == input2) { System.out.println("정답입니다."); break; } else if
 * (randomNum > input2) { System.out.println(input2 + "보다 큰 수 입니다.");
 * System.out.println("기회는" + i + "번 남았습니다."); System.out.println("1~" + (input2
 * - 1)); int input3 = sc.nextInt();
 * 
 * if (randomNum == input3) { System.out.println("정답입니다."); break; } else {
 * System.out.println("아쉽습니다.. 기회를 다 소진하셨습니다"); System.out.println("정답은" +
 * randomNum); } i--; } } } }
 * 
 * }
 * 
 * }
 */
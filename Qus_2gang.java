package sugang0312;

import java.util.Scanner;

public class Qus_2gang {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("짝수 입력: ");
		int evenNum = sc.nextInt();

		System.out.print("홀수 입력: ");
		int oddNum = sc.nextInt();

		int[] nums = new int[evenNum + oddNum]; // 짝수 홀수 배열 따로 만들지 않고 한 배열로 처리함

		int evenIdx = 0, oddIdx = nums.length - 1; // 짝수는 0부터, 홀수는 애초에 길이를 모름.. 그렇지만 역방향으로 출력해주어함

		for (int i = 0; i < nums.length; i++) {
			System.out.print(("num" + (i + 1) + ":"));
			int num = sc.nextInt();

			if (num % 2 == 0 && evenIdx < evenNum) {
				nums[evenIdx++] = num; // 0번째 입력하고, 1번째 입력, 2번째 입력... 인덱스를 증가시켜주면 됨
			} else if (num % 2 == 1 && oddIdx >= evenNum) {
				nums[oddIdx--] = num; // 감소시켜주면 역방향으로 출력됨

			}else {
				i--;
			}
		}
		System.out.println("<총 " + nums.length + "개 정수 출력>");
		for (int num : nums) {
			System.out.print(num + "  ");
		}
		System.out.println();
	}
}

/*
 * 짝수 : nums[0] ~ nums[evenNum-1]   // evenNum으로 표현이 가능함
 * 홀수 : nums[evenNum] ~ nums[nums.length-1]
 */
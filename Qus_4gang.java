package sugang0312;

public class Qus_4gang {

	public static void main(String[] args) {
		int[] nums = new int[99]; // 2부터 100까지의 숫자를 저장하기 위한 배열

		for (int i = 0; i < nums.length; i++) {
			nums[i] = i + 2;

		}

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				for (int j = i + 1; j < nums.length; j++) {
					if (nums[j] % nums[i] == 0) {
						nums[j] = 0;
					}
				}
			}

		}

		for (int i : nums) { // nums라는 배열의 i번째부터 배열을 출력함
			if (i != 0) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}
}
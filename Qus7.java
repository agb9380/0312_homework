package sugang0312;

import java.util.Random;
import java.util.Scanner;

public class Qus7 {

	public static void main(String[] args) {
		Random r = new Random(); // 0~99사이의 수 중 내가 생각한 숫자를 컴퓨터가 맞추는 것 , 0~99 +1 => 0~100
		int randomNum = r.nextInt(100) + 1; // 0~100사이의 수를 랜덤으로 추출
		Scanner sc = new Scanner(System.in);
		int start = 1;
		int end=100;

		while(true) {
			System.out.println("사용자가 생각하는 숫자가" + "[" + randomNum + "]" + "입니까?(맞으면 0,작은 수면 1, 큰수면 2)");
			int input = sc.nextInt();
			
			if(input == 0) {
				System.out.println("사용자가 생각하는 숫자를 맞추었습니다.");
				break;
			}else if (input == 1 && randomNum >0 ) {    //사용자가 생각하는 숫자보다 작다	
				end = randomNum-1;
				randomNum = (int) ((Math.random() * (end - start)) +start);	// 범위 지정	   // min이랑 max값이 고정되어 있어서 발생한 문제..			
			}else if (input == 2) {
				start = randomNum + 1;
				randomNum = (int) ((Math.random() * (end - start)) +start);
			}
		}
		
	}

}

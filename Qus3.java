/* 3. 소수는 1 ~ (판단정수) 사이의 소수로만 나누어 약수가 존재하지 않는다라는 규칙성을 이용항
2 ~ 100사이의 소수를 구분 및 출력하는 코드를 작성(배열) */

package sugang0312;

import java.util.Arrays;

public class Qus3 {

	public static void main(String[] args) {

		int[] Arr = new int[99];
		int[] D_Arr = new int[99];

		for (int i = 0; i < Arr.length; i++) {
			Arr[i] = i + 2;
		}
		for (int j = 0; j < D_Arr.length; j++) {
			D_Arr[j] = j + 2;
			for (int k = 2; k < 10; k++) {
				if (D_Arr[j] != k && D_Arr[j] % k == 0) {
					D_Arr[j] = 0;
				}
			}
		}
		for (int k = 1; k < Arr.length; k++) {
			for (int l = 0; l < k; l++) {
				if (D_Arr[l] !=0 && Arr[k] % D_Arr[l] == 0) {
					Arr[k] = 0;
				}
			}
		}System.out.println(Arrays.toString(Arr));
	}
}
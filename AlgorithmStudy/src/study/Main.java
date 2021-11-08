package study;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float num = sc.nextFloat();
		float[] numArr = new float[(int)num];

		float max = 0;
		float avg = 0;
		float sum = 0;

		for (int i = 0; i < num; i++) {
			numArr[i] = sc.nextFloat();
		}

		for (int i = 0; i < num; i++) {
			if (max < numArr[i]) {
				max = numArr[i];
			}

		} // end for

		for (int i = 0; i < num; i++) {
			numArr[i] = (numArr[i] / max) * 100;
			sum += numArr[i];
		}

		
		avg =  sum /  num;

		System.out.printf("%.6f", avg);

	}
}

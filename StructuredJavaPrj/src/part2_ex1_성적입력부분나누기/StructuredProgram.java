package part2_ex1_�����Էºκг�����;

import java.util.Scanner;

public class StructuredProgram {

	static int menu;
	static boolean keepLoop = true;

	public static void main(String[] args) {
		int[] korList = new int[3];

		while (keepLoop) {
			menu = ���θ޴�();

			switch (menu) {
			case 1:
				�����Է�(korList);

				break;
			case 2:
				�������(korList);

				break;
			case 3:
				System.out.println("Bye~~");

				keepLoop = false;
				break;

			default:
				System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�. �޴��� 1~3�����Դϴ�.");

			}

		}
	}// end main

	static void �����Է�(int[] kors) {
		int kor;

		Scanner scan = new Scanner(System.in);

		System.out.println("����������������������������������������������������������");
		System.out.println("��           ����  �Է�                   ��");
		System.out.println("����������������������������������������������������������");
		System.out.println();

		for (int i = 0; i < 3; i++) {
			do {
				System.out.printf("����%d : ", i + 1);
				kor = scan.nextInt();

				if (kor < 0 || 100 < kor)
					System.out.println("������� 0~100������ ������ �Է��� �����մϴ�.");

			} while (kor < 0 || 100 < kor);
			kors[i] = kor;
		}
		System.out.println("����������������������������������������������������������");

	} // end �����Է�

	static void �������(int[] kors) {

		int total = 0;
		float avg;

		for (int i = 0; i < 3; i++)
			total += kors[i];

		avg = total / 3.0f;

		System.out.println("����������������������������������������������������������");
		System.out.println("��           ����  ���                   ��");
		System.out.println("����������������������������������������������������������");
		System.out.println();

		for (int i = 0; i < 3; i++)
			System.out.printf("���� %d : %3d\n", 3 - i, kors[i]);

		System.out.printf("���� : %3d\n", total);
		System.out.printf("��� : %6.2f\n", avg);
		System.out.println("����������������������������������������������������������");

	} // end �������

	static int ���θ޴�() {

		Scanner scan = new Scanner(System.in);

		System.out.println("����������������������������������������������������������");
		System.out.println("��           ���� �޴�                   ��");
		System.out.println("����������������������������������������������������������");
		System.out.println("\t1. �����Է� ");
		System.out.println("\t2. ������� ");
		System.out.println("\t3. ���� ");
		System.out.println("\t����> ");
		int menu = scan.nextInt();

		return menu;

	}// end ���θ޴�
}

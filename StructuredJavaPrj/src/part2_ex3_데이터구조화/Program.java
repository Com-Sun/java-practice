/*package part2_ex3_데이터구조화;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Exam[] exams = new Exam[3];

		int menu;
		boolean keepLoop = true;

		while (keepLoop) {
			menu = inputMenu();

			switch (menu) {
			case 1:
				inputList(exams);

				break;
			case 2:
				printKor(exams);

				break;
			case 3:
				System.out.println("Bye~~");

				keepLoop = false;
				break;

			default:
				System.out.println("잘못된 값을 입력하셨습니다. 메뉴는 1~3까지입니다.");

			}

		} // end while

	} // end main

	private static void inputList(Exam[] exams) {
		int kor;

		Scanner scan = new Scanner(System.in);

		System.out.println("┌───────────────────────────┐");
		System.out.println("│           성적  입력                   │");
		System.out.println("└───────────────────────────┘");
		System.out.println();

		for (int i = 0; i < 3; i++) {
			do {
				System.out.printf("국어%d : ", i + 1);
				kor = scan.nextInt();

				if (kor < 0 || 100 < kor)
					System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");

			} while (kor < 0 || 100 < kor);
			kors[i] = kor;
		}
		System.out.println("─────────────────────────────");

	}//end inputList

	static int inputMenu() {

		Scanner scan = new Scanner(System.in);

		System.out.println("┌───────────────────────────┐");
		System.out.println("│           메인 메뉴                    │");
		System.out.println("└───────────────────────────┘");
		System.out.println("\t1. 성적입력 ");
		System.out.println("\t2. 성적출력 ");
		System.out.println("\t3. 종료 ");
		System.out.println("\t선택> ");
		int menu = scan.nextInt();

		return menu;
	}// end inputMenu

}// end class

*/
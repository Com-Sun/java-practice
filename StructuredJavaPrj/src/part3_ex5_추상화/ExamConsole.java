package part3_ex5_추상화;

import java.util.Scanner;

public abstract class ExamConsole {

	private ExamList list = new ExamList();

	public void print() {
		print(list.size()); // 코드의 집중화
	}

	public void print(int size) {
		System.out.println("┌───────────────────────────┐");
		System.out.println("│           성적  출력                   │");
		System.out.println("└───────────────────────────┘");
		System.out.println();

		// int size = list.current;

		for (int i = 0; i < size; i++) {
			Exam exam = list.get(i);//
			int kor = exam.getKor();// exam.kor;
			int eng = exam.getEng();// exam.eng;
			int math = exam.getMath();// exam.math;

			int total = exam.total();// kor + eng + math;
			float avg = exam.avg(); // total / 3.0f;

			System.out.printf("국어 : %d\n", kor);
			System.out.printf("영어 : %d\n", eng);
			System.out.printf("수학 : %d\n", math);

			System.out.printf("총점 : %3d\n", total);
			System.out.printf("평균 : %6.2f\n", avg);
			System.out.println("─────────────────────────────");
		}

	}

	public void input() {
		Scanner scan = new Scanner(System.in);

		System.out.println("┌───────────────────────────┐");
		System.out.println("│           성적  입력                   │");
		System.out.println("└───────────────────────────┘");
		System.out.println();

		int kor, eng, math;

		do {
			System.out.printf("국어 : ");
			kor = scan.nextInt();

			if (kor < 0 || 100 < kor)
				System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");

		} while (kor < 0 || 100 < kor);

		do {
			System.out.printf("영어 : ");
			eng = scan.nextInt();

			if (eng < 0 || 100 < eng)
				System.out.println("영어성적은 0~100까지의 범위만 입력이 가능합니다.");

		} while (eng < 0 || 100 < eng);

		do {
			System.out.printf("수학 : ");
			math = scan.nextInt();

			if (math < 0 || 100 < math)
				System.out.println("수학성적은 0~100까지의 범위만 입력이 가능합니다.");

		} while (math < 0 || 100 < math);
		/*
		 * Exam exam = new Exam(); exam.setKor(kor);// exam.kor = kor;
		 * exam.setEng(kor);// exam.eng = eng; exam.setMath(kor);// exam.math = math;
		 */
		// Exam exam = new Exam(kor, eng, math);
		Exam exam = makeExam();
		exam.setKor(kor);
		exam.setEng(eng);
		exam.setMath(math);

		// add -------------------------------------

		list.add(exam);

	}// end inputList

	protected abstract Exam makeExam();

}

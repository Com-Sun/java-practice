package part3_ex5_추상화;

public class Program {

	public static void main(String[] args) {
		//Exam exam = new NewlecExam();
		
		ExamConsole console = new NewlecExamConsole();
		console.input();
		console.print();
		
		
	}

}

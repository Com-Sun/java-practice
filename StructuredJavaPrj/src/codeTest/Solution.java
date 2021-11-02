package codeTest;

class Solution {
	public static int[] solution(int[] lottos, int[] win_nums) {

		int count = 0;
		int numZero = 0;

		for (int i = 0; i < 6; i++) {
			if (lottos[i] == 0) {
				numZero++;
			}
		}

		switch (numZero) {
		case 1:
			;
			break;

		case 2:
			;
			break;

		case 3:
			;
			break;

		case 4:
			;
			break;

		case 5:
			;
			break;

		case 6:
			;
			break;
		}

		int[] answer = {};

		return answer;
	}

	public static void main(String[] args) {
		int[] lottos = { 1, 2, 3, 4, 0, 0 };
		int[] win_nums = { 1, 2, 3, 4, 5, 6 };

		solution(lottos, win_nums);

	}
}
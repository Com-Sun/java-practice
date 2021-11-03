package codeTest;

public class save {
	/*
	 class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        
        int count = 0;
		int numZero = 0;
		int[] answer = new int[2];

		for (int i = 0; i < 6; i++) {
			if (lottos[i] == 0) {
				numZero++;
			}
		}

		switch (numZero) {

		case 0:
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 6; j++) {
					if (lottos[i] == win_nums[j]) {
						count++;
					}
				}
			}
			answer[0] = 7 - count;
			answer[1] = 7 - count;

			if (answer[0] == 7) {
				answer[0] = 6;
			}

			if (answer[1] == 7) {
				answer[1] = 6;
			}

			break;

		case 1:
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 6; j++) {
					if (lottos[i] == win_nums[j]) {
						count++;
					}
				}
			}
			answer[0] = 6 - count;
			answer[1] = 7 - count;

			if (answer[1] == 7) {
				answer[1] = 6;
			}

			break;

		case 2:
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 6; j++) {
					if (lottos[i] == win_nums[j]) {
						count++;
					}
				}

			}
			answer[0] = 5 - count;
			answer[1] = 7 - count;

			if (answer[1] == 7) {
				answer[1] = 6;
			}

			break;

		case 3:
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 6; j++) {
					if (lottos[i] == win_nums[j]) {
						count++;
					}
				}
			}
			answer[0] = 4 - count;
			answer[1] = 7 - count;

			if (answer[1] == 7) {
				answer[1] = 6;
			}

			break;

		case 4:
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 6; j++) {
					if (lottos[i] == win_nums[j]) {
						count++;
					}
				}
			}
			answer[0] = 3 - count;
			answer[1] = 7 - count;

			if (answer[1] == 7) {
				answer[1] = 6;
			}
			break;

		case 5:
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 6; j++) {
					if (lottos[i] == win_nums[j]) {
						count++;
					}
				}
			}
			answer[0] = 2 - count;
			answer[1] = 7 - count;

			if (answer[1] == 7) {
				answer[1] = 6;
			}
			break;

		case 6:
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 6; j++) {
					if (lottos[i] == win_nums[j]) {
						count++;
					}
				}
			}
			answer[0] = 1 - count;
			answer[1] = 7 - count;

			if (answer[1] == 7) {
				answer[1] = 6;
			}
			break;
		}

		return answer;
    }
}
	 */

}

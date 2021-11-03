package codeTest;

class Solution {
	public String solution(String new_id) {
		
		String id = new_id;
		char[] arrId = new char[id.length()];

		int count;
		for (count = 0 ; count < 7; count++) {
			switch (count) {
			case 0: 
				for ( int i = 0; i < arrId.length; i++) {
					arrId[i] = (id.charAt(i));
					if (arrId[i] >= 65 && arrId[i] <= 90 ) {
						arrId[i] += 32;
					}
				}
				
				break;

			case 1: // 소문자, 숫자, -_. 제외 다제거
				
				break;

			case 2:
				break;

			case 3:
				break;

			case 4:
				break;

			case 5:
				break;

			case 6:
				break;
			}

		}

		String answer = new String(arrId);
		System.out.println(answer);
		return answer;
	}


	public static void main(String[] args) {


	}
}
package codeTest;

class Solution {
	public static void main(String[] args) {
		
		String[] input1 = {"a 10", "b 24"};
		String[] input2 = {"PIZZA aabab 140", "SSE aaaab 164"};
		String[] input3 = {"PIZZA 5", "SSE 1"};
		
		solution(input1, input2, input3);

	}

	public static int solution(String[] ings, String[] menu, String[] sell) {
		int answer = 0;

		for (int i = 0; i < menu.length; i++) {
			String[] menu1 = menu[i].split(" ");
			for (int j = 0; j < 3; j ++) {
				System.out.println(menu1[j]);
			}
		} // end for
		
		return answer;
	}

}

//재료 : 이름(소문자 1) + 원가
//메뉴 : 이름 + 필요 재료 + 판매가
//판매 : 이름 + 판매 수량
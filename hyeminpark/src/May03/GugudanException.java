package May03;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
	
public class GugudanException {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int i;
		int check = 0;
		
		while(check == 0) {
			System.out.println("출력할 구구단 단 수를 입력하세요 : ");
			String input = br.readLine();
			
			if (isInteger(input)) {
				int num = Integer.parseInt(input);
				
				while(true) {
					if (num > 999 || num <= 0) {
						System.out.println("1~999 사이의 값만 유효합니다.");
						break;
					}
					else {
						System.out.println("*****" + num + "단*****");
						for (i = 1; i <= 9; i++) {
							System.out.println(num+" * " + i + " = "+num*i);
						}
						check = 1;
						break;
					}
				}
				
			} else if (isDouble(input)) {
				double num = Double.parseDouble(input);
				System.out.println("입력한 값은 실수형입니다. 정수로 다시 입력하세요.");
				
			} else {
				System.out.println("입력한 값은 문자열입니다. 정수로 다시 입력하세요.");
			}
		}
	}
	
	public static boolean isInteger(String s) {
		try {
			Integer.parseInt(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static boolean isDouble(String s) {
		try {
			Double.parseDouble(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}


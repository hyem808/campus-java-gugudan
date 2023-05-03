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
			System.out.println("����� ������ �� ���� �Է��ϼ��� : ");
			String input = br.readLine();
			
			if (isInteger(input)) {
				int num = Integer.parseInt(input);
				
				while(true) {
					if (num > 999 || num <= 0) {
						System.out.println("1~999 ������ ���� ��ȿ�մϴ�.");
						break;
					}
					else {
						System.out.println("*****" + num + "��*****");
						for (i = 1; i <= 9; i++) {
							System.out.println(num+" * " + i + " = "+num*i);
						}
						check = 1;
						break;
					}
				}
				
			} else if (isDouble(input)) {
				double num = Double.parseDouble(input);
				System.out.println("�Է��� ���� �Ǽ����Դϴ�. ������ �ٽ� �Է��ϼ���.");
				
			} else {
				System.out.println("�Է��� ���� ���ڿ��Դϴ�. ������ �ٽ� �Է��ϼ���.");
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

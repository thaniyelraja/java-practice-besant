package Patterns;

public class Pattern30 {

	public static void main(String[] args) {
		char ch = 'A';
		for (char i = 1; i <= 5; i++) {
			for (char j = 1; j <= 5; j++) {
				System.out.print(ch++ + " ");
			}
			System.out.println();
		}

	}

}

package pattern_temp;

public class Pattern37 {

	public static void main(String[] args) {
		int x;
		for (int i = 1; i <= 5; i++) {
			x = 5 - i + 1;
			for (int j = 1; j <= i; j++) {

				System.out.print(x + " ");
			}
			System.out.println();
		}

	}

}

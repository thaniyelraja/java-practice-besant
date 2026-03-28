package patterns;

public class Pattern33 {

	public static void main(String[] args) {
		int x;
		for (int i = 1; i <= 5; i++) {
			x = 5 - i + 1;
			for (int j = 1; j <= 5; j++) {
				System.out.print((char) (x + 64) + " ");
				x += 5;
			}
			System.out.println();
		}

	}

}

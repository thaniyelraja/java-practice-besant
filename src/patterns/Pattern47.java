package patterns;

public class Pattern47 {

	public static void main(String[] args) {
		int x;
		for (int i = 1; i <= 5; i++) {
			x = i;
			for (int j = 1; j <= i; j++) {
				System.out.print(x + " ");
				x += i;
			}
			System.out.println();
		}

	}

}

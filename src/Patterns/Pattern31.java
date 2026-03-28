package patterns;

public class Pattern31 {

	public static void main(String[] args) {
		for (char i = 'A'; i <= 'E'; i++) {
			char ch = i;
			for (char j = 'A'; j <= 'E'; j++) {
				System.out.print(ch++ + " ");
			}
			System.out.println();
		}

	}

}

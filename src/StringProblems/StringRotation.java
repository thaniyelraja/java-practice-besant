package StringProblems;

public class StringRotation {
	public static void main(String[] args) {
		String str1 = "abcde";
		String str2 = "cdeab";

		if (str1.length() == str2.length() && (str1 + str1).contains(str2)) {
			System.out.println("Rotation");
		} else {
			System.out.println("Not Rotation");
		}
	}
}

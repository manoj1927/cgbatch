package week2coding;

public class Vowel {

	public static void countvowel(String str) {
		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {

				count++;
			}
		}

		if (count > 0) {
			System.out.println("Total no of vowels in string are: " + count);
		} else {
			System.out.println("no vowels are present:"+ count);
		}

	}

	public static void main(String[] args) {
		countvowel("mahendra singh dhoni");
		countvowel("dwhrn drt grt");
		

	}

}

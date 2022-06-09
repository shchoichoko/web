
public class Word {

	public static void main(String[] args) {
		Word word = new Word("Hello World");
		System.out.println(word.isVowel(0));
		System.out.println(word.isVowel(1));
	}

	private String letters;

	public Word(String letters) {
		this.letters = letters.toLowerCase();
	}

	// i번째 글자가 모음인지 //a, e ,i ,o ,u
	public boolean isVowel(int i) {
		boolean check = false;
		String checkString = letters.substring(i, i + 1);

		if (checkString.equals("a") || checkString.equals("e")
				|| checkString.equals("i") || checkString.equals("o")
				|| checkString.equals("u")) {
			check = true;
		}
		return check;
	}

}

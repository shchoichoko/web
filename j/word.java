
public class Word {

  public static void main(String[] args) {
    Word word = new Word("Hello World");
    System.out.println(word.isVowel(0));
    System.out.println(word.isVowel(1));
    System.out.println(word.isConsonant2(0));
    System.out.println(word.isConsonant2(1));
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

  // i 번째 글자가 자음인지
  public boolean isConsonant(int i) {
    boolean check = true;
    String checkConsonant = letters.substring(i, i + 1);
    if (checkConsonant.equals("a") || checkConsonant.equals("e")
        || checkConsonant.equals("i") || checkConsonant.equals("o")
        || checkConsonant.equals("u")) {
      check = false;
    }
    return check;
  }

  public boolean isConsonant2(int i) {
    String checkConsonant = letters.substring(i, i + 1);
    return !("aeiou".contains(checkConsonant));
  }
}

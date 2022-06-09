
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

  // i번째 글자가 모음인지 찾아내기 //a, e ,i ,o ,u
  public boolean isVowel(int i) {
    boolean check = false;

    if (letters.substring(i, i + 1).equals("a") || letters.substring(i, i + 1).equals("e")
        || letters.substring(i, i + 1).equals("i") || letters.substring(i, i + 1).equals("o")
        || letters.substring(i, i + 1).equals("u")) {
      check = true;
    }
    return check;
  }

}

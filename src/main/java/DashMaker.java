public class DashMaker {
  public static void main( String[] args ) {}

    public String replaceVowels(String answer){
      String puzzle = answer.toLowerCase().replace('a', '-').replace('e', '-').replace('i', '-').replace('o', '-').replace('u', '-');

      return puzzle;
  }
}

import java.util.Random;

public class DashMaker {
  public static void main( String[] args ) {}

    public String[] replaceVowels(){

      String[] puzzleArray = {"hello world", "muffins are buttered but the toast is burnt", "do you like to play guessing games", "Java is a silly language", "One more for good luck"};

      Random numberGenerator = new Random();
      int number = numberGenerator.nextInt(5);

      String answer = puzzleArray[number];

      String puzzle = answer.toLowerCase().replace('a', '-').replace('e', '-').replace('i', '-').replace('o', '-').replace('u', '-');

      String[] puzzleAndAnswer = new String[2];
      puzzleAndAnswer[0] = puzzle;
      puzzleAndAnswer[1] = answer;
      //System.out.println(puzzleAndAnswer[1]);

      return puzzleAndAnswer;
  }
}

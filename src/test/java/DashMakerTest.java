import org.junit.*;
import static org.junit.Assert.*;

public class DashMakerTest {

  @Test
  public void replaceVowels_forOneVowel_dash() {
    DashMaker test = new DashMaker();
    assertEquals("-", test.replaceVowels("a"));
  }
}

import org.junit.*;
import static org.junit.Assert.*;

public class DashMakerTest {

  @Test
  public void replaceVowels_forOneVowelA_dash() {
    DashMaker test = new DashMaker();
    assertEquals("-", test.replaceVowels("a"));
  }

  @Test
  public void replaceVowels_forVowelsAAndConsonants_rDashD() {
    DashMaker test = new DashMaker();
    assertEquals("r-d", test.replaceVowels("rad"));
  }

  @Test
  public void replaceVowels_forAllVowelsAndConsonants_string() {
    DashMaker test = new DashMaker();
    assertEquals("h-ll- w-rld", test.replaceVowels("Hello World"));
  }
}

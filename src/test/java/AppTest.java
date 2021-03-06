import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("A head for a test");
  }

  @Test
  public void indexTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("Click here to play");
  }

  @Test
  public void puzzlePageTest() {
    goTo("http://localhost:4567/get_puzzle");
    assertThat(pageSource()).contains("Guess the phrase");
  }
}

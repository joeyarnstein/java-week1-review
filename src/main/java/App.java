import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";


    get("/", (request, response) -> {
      Map model = new HashMap();
      model.put("template", "templates/index.vtl" );
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/get_puzzle", (request, response) -> {
      Map model = new HashMap();
      model.put("template", "templates/puzzle.vtl" );
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}

package creational.factory_method;

import java.util.HashMap;
import java.util.Map;

import creational.factory_method.matcha.Controller;

// this guy uses to default Matcha view engine
// public class ProductController extends SharpController {
public class ProductController extends Controller {
    public void listPorducts() {
        // Get products from db
        Map<String, Object> context = new HashMap<String, Object>();
        // context.put(products)
        // this is a solution, but we making harder for devs
        // render("products.html", context, new MatchaViewEngine());
        render("products.html", context);
    }
}

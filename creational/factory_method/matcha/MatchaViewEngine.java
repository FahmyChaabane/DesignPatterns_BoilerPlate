package creational.factory_method.matcha;

import java.util.Map;

public class MatchaViewEngine implements ViewEngine{
    public String render(String viewName, Map<String, Object> context) {
        return "View Rendered by Matcha";
    }
}

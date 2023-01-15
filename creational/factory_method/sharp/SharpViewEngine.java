package creational.factory_method.sharp;

import java.util.Map;

import creational.factory_method.matcha.ViewEngine;

public class SharpViewEngine implements ViewEngine {

    @Override
    public String render(String viewName, Map<String, Object> context) {
        return "View Rendered by Sharp";
    }
}

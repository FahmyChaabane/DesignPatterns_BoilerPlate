package creational.factory_method.matcha;

import java.util.Map;

public class Controller {
    public void render(String viewName, Map<String, Object> context) {
        // this is a solution, but we making harder for devs
        // public void render(String viewName, Map<String, Object> context, ViewEngine engine) {
        ViewEngine engine = createViewEngine();
        String html = engine.render(viewName, context);
        // return the html content to the client
        System.out.println("html :" + html);
    }

    public void oldRender(String viewName, Map<String, Object> context) {
        // this is a solution, but we making harder for devs
        // public void render(String viewName, Map<String, Object> context, ViewEngine engine) {
        MatchaViewEngine engine = new MatchaViewEngine();
        String html = engine.render(viewName, context);
        // return the html content to the client
        System.out.println("html :" + html);
    }

    protected ViewEngine createViewEngine() {
        return new MatchaViewEngine();
    }
    // also could be : to inforce subclasses to implement it    
    // protected asbtract ViewEngine createViewEngine();
}

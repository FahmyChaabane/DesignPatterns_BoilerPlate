package creational.factory_method.sharp;

import creational.factory_method.matcha.Controller;
import creational.factory_method.matcha.ViewEngine;

public class SharpController extends Controller {

    @Override
    protected ViewEngine createViewEngine() {
        return new SharpViewEngine();
    }
    
}

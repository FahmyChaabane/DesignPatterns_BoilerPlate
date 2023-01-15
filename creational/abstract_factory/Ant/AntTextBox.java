package creational.abstract_factory.Ant;

import creational.abstract_factory.TextBox;

public class AntTextBox implements TextBox {
    
    @Override
    public void render() {
        System.out.println("render Ant TextBox");        
    }
    
}

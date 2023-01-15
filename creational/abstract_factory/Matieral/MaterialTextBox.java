package creational.abstract_factory.Matieral;

import creational.abstract_factory.TextBox;

public class MaterialTextBox implements TextBox {

    @Override
    public void render() {
        System.out.println("render Material TextBox");        
    }
    
}

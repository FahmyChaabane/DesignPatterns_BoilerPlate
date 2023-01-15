package creational.abstract_factory.Matieral;

import creational.abstract_factory.Button;
import creational.abstract_factory.TextBox;
import creational.abstract_factory.WidgetFactory;

public class MaterialWidgetFactory implements WidgetFactory {

    @Override
    public Button createButton() {
        return new MaterialButton();
    }

    @Override
    public TextBox createTextBox() {
        return new MaterialTextBox();
    }
    
}

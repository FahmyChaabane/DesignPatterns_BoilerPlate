package creational.abstract_factory.Ant;

import creational.abstract_factory.Button;
import creational.abstract_factory.TextBox;
import creational.abstract_factory.WidgetFactory;

public class AntWidgetFactory implements WidgetFactory {

    @Override
    public Button createButton() {
        return new AntButton();
    }

    @Override
    public TextBox createTextBox() {
        return new AntTextBox();
    }
    
}

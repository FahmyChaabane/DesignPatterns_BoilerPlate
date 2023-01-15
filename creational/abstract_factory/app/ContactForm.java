package creational.abstract_factory.app;

import creational.abstract_factory.Theme;
import creational.abstract_factory.WidgetFactory;
import creational.abstract_factory.Ant.AntButton;
import creational.abstract_factory.Ant.AntTextBox;
import creational.abstract_factory.Matieral.MaterialButton;
import creational.abstract_factory.Matieral.MaterialTextBox;

public class ContactForm {
    public void render(WidgetFactory factory) {
        factory.createButton().render();
        factory.createTextBox().render();
    }
}

// should not do this
class OldContactForm {
    public void render(Theme theme) {
        // in real app we would return them as a form to a client
        if(theme == Theme.MATERIAL) {
            new MaterialButton().render();
            new MaterialTextBox().render();
        } else if (theme == Theme.ANT) {
            new AntButton().render();
            new AntTextBox().render();
        }
    }
}

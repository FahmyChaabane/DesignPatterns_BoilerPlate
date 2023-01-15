package creational.abstract_factory;

import creational.abstract_factory.Matieral.MaterialWidgetFactory;
import creational.abstract_factory.app.ContactForm;

public class Main {
    public static void main(String[] args) {
        ContactForm contactForm = new ContactForm();
        contactForm.render(new MaterialWidgetFactory());
        
    }
    
}

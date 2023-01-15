package creational.abstract_factory.Matieral;

import creational.abstract_factory.Button;

public class MaterialButton implements Button {

    @Override
    public void render() {
        System.out.println("render Material Button");        
    }
    
}

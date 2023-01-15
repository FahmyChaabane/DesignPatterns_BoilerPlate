package creational.abstract_factory.Ant;

import creational.abstract_factory.Button;

public class AntButton implements Button {
    
    @Override
    public void render() {
        System.out.println("render Ant Button");        
    }

}

package structural.adapter.evafilters;

import structural.adapter.Image;

// Let's say this is a 3rd party library that we use to filter our photos with
public class Caramel {

    // let's suppose this is requirement by out 3rd party library
    public void init() {
        System.out.println("Initiate");
    }

    public void render(Image image) {
        System.out.println("Apply Caramel Filter");      
    }
    
}

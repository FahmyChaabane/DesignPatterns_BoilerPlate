package structural.adapter;

import structural.adapter.evafilters.Caramel;

public class Main {

    public static void main(String[] args) {
        ImageView imageView = new ImageView(new Image());
        imageView.apply(new VividFilter());
        // imageView.apply(new Caramel());
        imageView.apply(new CaramelFilter(new Caramel()));
    }
    
}


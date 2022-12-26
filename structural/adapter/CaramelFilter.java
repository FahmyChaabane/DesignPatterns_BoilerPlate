package structural.adapter;

import structural.adapter.evafilters.Caramel;

public class CaramelFilter implements Filter {

    Caramel caramel;

    public CaramelFilter(Caramel caramel) {
        this.caramel = caramel;
    }

    @Override
    public void apply(Image image) {
        caramel.init();
        caramel.render(image);
    }
    
}

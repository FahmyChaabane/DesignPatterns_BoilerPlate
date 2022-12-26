package structural.composite;

import java.util.ArrayList;
import java.util.List;


class Group implements Component {
    private List<Component> components = new ArrayList<Component>();

    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void render() {
        for(Component component : components) {
            component.render();
        }
    }

    @Override
    public void move() {
        for(Component component : components) {
            component.move();
        }
        
    }
}

// should not do this
class OldGroup {
    /*
    private List<Object> objects = new ArrayList<Object>();

    public void add(Object shape) {
        objects.add(shape);
    }

    public void render() {
        for(Object object : objects) {
            if(object instanceof Shape) {
                ((Shape)object).render();
            } else if(object instanceof Group) {
                ((Group)object).render();
            }
        }
    }
    */
}

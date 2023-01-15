package creational.prototype;

public class ContextMenu {
        public void dublicate(Component component) {
        Component target = component.clone();
        System.out.println("cloning has be done " + target);
        // add target to the document
    }
    
}

// should not do thiis
class OldContextMenu {

    public void duplicate(Component component) {
        if(component instanceof Circle) {
            Circle source = (Circle)component;
            Circle target = new Circle();
            target.setRadius(source.getRadius());
            // add target to the document
        }
    }
}

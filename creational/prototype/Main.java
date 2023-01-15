package creational.prototype;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(5);
        ContextMenu contextMenu = new ContextMenu();
        contextMenu.dublicate(circle);
    }
}

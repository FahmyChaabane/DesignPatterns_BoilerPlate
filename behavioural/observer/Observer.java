package observer;

public interface Observer {
    // push style
    // value can be a complexe object, we can use Generics.
    // public void update(int value);

    // pull style
    public void update();
}

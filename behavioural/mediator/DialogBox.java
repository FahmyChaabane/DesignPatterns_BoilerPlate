package mediator;

// Could be interface too. but in real GUI, this class would provide other behaviors
public abstract class DialogBox {
    abstract void changed(UIControl control);
}

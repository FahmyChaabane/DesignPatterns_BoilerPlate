package memento;

public class Main {
    public static void main(String[] args) {
        
        Editor editor = new Editor();
        History history = new History();

        editor.setContent("a");
        editor.setColor("blue");
        
        history.push(editor.createState());
        editor.setContent("b");
        editor.setColor("red");
        
        history.push(editor.createState());
        editor.setContent("c");

        // Before popping
        System.out.println(editor.getCurrentState());

        editor.restore(history.pop());
        System.out.println(editor.getCurrentState());

        editor.restore(history.pop());
        System.out.println(editor.getCurrentState());

    }
}

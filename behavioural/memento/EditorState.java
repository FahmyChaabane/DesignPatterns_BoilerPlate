package memento;

public class EditorState {
    private final String content;
    private final String color;

    public EditorState(String content, String color) {
        this.content = content;
        this.color = color;
    }

    public String getContent() {
        return content;
    }

    public String getColor() {
        return color;
    }
}

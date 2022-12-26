package memento;

public class Editor {
    private String content;
    private String color;

    public EditorState createState() {
        return new EditorState(content, color);
    }

    public void restore(EditorState editorState) {
        content = editorState.getContent();
        color = editorState.getColor();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCurrentState() {
        return "Current State is >>> " + "content: " + content + ", " + "color: " + color;
    }

}

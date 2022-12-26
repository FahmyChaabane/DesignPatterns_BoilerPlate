package memento;

import java.util.ArrayList;
import java.util.List;

public class History {

    private List<EditorState> editorStates = new ArrayList<EditorState>();
    
    public void push(EditorState state) {
        editorStates.add(state);
    }

    public EditorState pop() {
        int lastIndex = editorStates.size() -1;
        EditorState lastState = editorStates.get(lastIndex);
        editorStates.remove(lastIndex);
        
        return lastState;
    }
    
}

package state;

public class Canvas {
    private Tool currentTool;
    
    public void mouseDown() {
        currentTool.mouseDown();
    }
     
    public void mouseUp() {
        currentTool.mouseUp();
    }

    public Tool getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }
    
}


// we should not do this
class OldCanvas {
    private ToolType currentTool;
    
    public void mouseDown() {
        if(currentTool == ToolType.SELECTION) {
            System.out.println("Selection Icon");
        } else if(currentTool == ToolType.BRUSH) {
            System.out.println("Brush Icon");
        } else if(currentTool == ToolType.ERASER) {
            System.out.println("Eraser Icon");
        }
    }
     

    public void mouseUp() {
        if(currentTool == ToolType.SELECTION) {
            System.out.println("Draw Dashed rectangle");
        } else if(currentTool == ToolType.BRUSH) {
            System.out.println("Draw Line");
        } else if(currentTool == ToolType.ERASER) {
            System.out.println("Draw Eraser");
        }
    }

    public ToolType getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(ToolType currentTool) {
        this.currentTool = currentTool;
    }
    
}

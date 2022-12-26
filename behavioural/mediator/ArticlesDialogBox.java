package mediator;

public class ArticlesDialogBox extends DialogBox {

    private ListBox articleListBox = new ListBox(this);
    private TextBox articleTextBox = new TextBox(this);
    private Button articleButton = new Button(this);

    public void simulateUserInteration() {
        articleListBox.setSelection("article 1");
        System.out.println("~~~~~");
        articleTextBox.setContent("");
        System.out.println("~~~~~");
        articleListBox.setSelection("article 2");
    }

    @Override
    void changed(UIControl control) {
        // here we implement all the intertion between these objects.
        if(control == articleListBox) {
            articleSelected();
        } else if(control == articleTextBox) {
            titleChanged();
        } else if(control == articleButton) {
            buttonChanged();
        }
    }

    private void articleSelected() {
        System.out.println("article selected");
            articleTextBox.setContent(articleListBox.getSelection());
            // articleButton.setEnabled(true);
    }

    private void titleChanged() {
        System.out.println("title changed");
        String content = articleTextBox.getContent();
        boolean isEmpty = (content == null || content.isEmpty());
        articleButton.setEnabled(!isEmpty);
    }

    private void buttonChanged() {
        System.out.println("button changed to " + (articleButton.isEnabled() ? "Enabled": "Disabled"));
    }

}

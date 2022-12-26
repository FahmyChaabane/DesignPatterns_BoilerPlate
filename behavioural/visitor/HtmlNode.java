package visitor;

public interface HtmlNode {
    void execute(Operation operation);
}

// should not do this.
interface OldHtmlNode {
    void highlight();
}

package visitor;

public class Main {
    public static void main(String[] args) {
        HtmlDocument document = new HtmlDocument();
        AnchorNode anchorNode = new AnchorNode();
        HeadingNode headingNode = new HeadingNode();
        document.add(anchorNode);
        document.add(headingNode);
        document.execute(new HighlightOperation());
        // document.execute(new PlainTextOperation());
    }
}

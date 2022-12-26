package visitor;

import java.util.ArrayList;
import java.util.List;

public class HtmlDocument {
    private List<HtmlNode> nodes = new ArrayList<HtmlNode>();

    public void add(HtmlNode node) {
        nodes.add(node);
    }

    // extensibility point, we can add as much operations as we need without modifying this class
    public void execute(Operation operation) {
        for(HtmlNode node : nodes) {
            node.execute(operation);
        }
    }

    // public void highlight() {
    //     for(HtmlNode node : nodes) {
    //         node.highlight();
    //     }
    // }
}

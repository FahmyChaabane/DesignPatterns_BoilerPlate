package visitor;

public class AnchorNode implements HtmlNode {

    @Override
    public void execute(Operation operation) {
        operation.apply(this);   
    }

}

// should not do this
// class OldAnchorNode implements HtmlNode {

//     @Override
//     public void highlight() {
//         System.out.println("Highlight Anchor");
//     }
// }

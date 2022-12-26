package visitor;

public class HeadingNode implements HtmlNode {

    @Override
    public void execute(Operation operation) {
        operation.apply(this);
    }
    
}

// should not do this
// class OldHeadingNode implements HtmlNode {

//     @Override
//     public void highlight() {
//         System.out.println("Highlight Heading");
//     }   
// }

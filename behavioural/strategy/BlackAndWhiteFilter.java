package strategy;

public class BlackAndWhiteFilter implements Filter {
    @Override
    public void apply() {
        System.out.println("Filtering using B&W");
    }
    
}

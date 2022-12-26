package strategy;

public class HighConstractFilter implements Filter {
    @Override
    public void apply() {
        System.out.println("Filtering using HIGH-CONTRAST");
    }
}

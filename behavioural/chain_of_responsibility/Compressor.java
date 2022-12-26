package chain_of_responsibility;

public class Compressor extends Handler {
    public Compressor(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest httpRequest) {
        System.out.println("compress");
        return true;
    }

}

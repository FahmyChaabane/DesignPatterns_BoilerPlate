package chain_of_responsibility;

public class Logger extends Handler {
    public Logger(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest httpRequest) {
        System.out.println("logging");
        return true;
    }

}

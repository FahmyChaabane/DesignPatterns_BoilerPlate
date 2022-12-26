package chain_of_responsibility;

public class Authenticator extends Handler {
    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest httpRequest) {
        System.out.println("authentication");
        boolean isValid = httpRequest.getUsername() == "admin" && httpRequest.getPassword() == "admin";
        return isValid;
    }
}

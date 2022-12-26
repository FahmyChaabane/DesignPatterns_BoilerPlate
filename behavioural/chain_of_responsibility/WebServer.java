package chain_of_responsibility;


public class WebServer {
    private Handler handler;

    public WebServer(Handler handler) {
        this.handler = handler;
    }

    public void handle(HttpRequest httpRequest) {
        handler.handle(httpRequest);
    }
}

// should not do this
class OldWebServer {
    public void handle(HttpRequest httpRequest) {
        // authentication
        // Authenticator authenticator = new Authenticator();
        // authenticator.authenticate(httpRequest);
        // loggin
        // compression
    }
}

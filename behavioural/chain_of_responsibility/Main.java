package chain_of_responsibility;

public class Main {
    public static void main(String[] args) {
        Handler handler = new Authenticator(new Logger(new Compressor(null)));
        WebServer webServer = new WebServer(handler);
        webServer.handle(new HttpRequest("admin", "admin"));
    }
}

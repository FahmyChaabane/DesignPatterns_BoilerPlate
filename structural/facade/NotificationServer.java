package structural.facade;

public class NotificationServer {
    // connect() -> Connection
    // authenticate(appID, key) -> AuthToken
    // send(authToken, message, target)
    // connection.disconect()

    public Connection connect(String ipAdress) {
        System.out.println("connecting...");
        return new Connection();
    }

    public AuthToken authenticate(String appID, String key) {
        return new AuthToken();
    }

    public void send(AuthToken authToken, Message message, String target) {
        System.out.println("Sending a message: " + message.getContent());
    }
}

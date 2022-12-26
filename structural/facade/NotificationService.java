package structural.facade;

public class NotificationService {
    public void send(String message, String target) {
        NotificationServer notificationServer = new NotificationServer();
        Connection connection = notificationServer.connect("126.215.255.6");
        AuthToken authToken = notificationServer.authenticate("xxxx", "zzzz");
        notificationServer.send(authToken, new Message(message), target);
        connection.disconnect();
    }
}

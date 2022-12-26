package structural.facade;

public class Main {

    public static void main(String[] args) {
        // NotificationServer notificationServer = new NotificationServer();
        // Connection connection = notificationServer.connect("126.215.255.6");
        // AuthToken authToken = notificationServer.authenticate("xxxx", "zzzz");
        // notificationServer.send(authToken, new Message("data"), "135.32.3.3");
        // connection.disconnect();
        NotificationService notificationService = new NotificationService();
        notificationService.send("data", "22.15.154.3");
    }
    
}


package structural.bridge;

public class Main {

    public static void main(String[] args) {
        Device device = new SonyTV();
        RemoteControl control = new RemoteControl(device);
        control.turnOn();
        AdvancedRemoteControl advancedRemoteControl = new AdvancedRemoteControl(device);
        advancedRemoteControl.turnOn();
        advancedRemoteControl = new AdvancedRemoteControl(new SamsungTV());
        advancedRemoteControl.turnOn();
    }
    
}


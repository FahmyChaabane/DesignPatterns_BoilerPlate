package structural.bridge;




public class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void turnOn() {
        device.turnOn();
    }

    public void turnOff() {
        device.turnOff();
    }
}



// Basic Remote Control (turnOn, turnOff)
// Advanced Remote Control (setChannel)
// Movie Remote Control (play, pause, rewind)

// RemoteControl
    // SonyRemoteControl
    // SamsungRemoteControl
    // AdvanceRemoteControl
        // SonyAdvanceRemoteControl
        // SamsungAdvanceRemoteControl
// for each new 'brand' of remote, we must implement 2 classes for it (if we had more than 3 'types' of remote controls, it would be 3).
// should not do this
abstract class OldRemoteControl {
    public abstract void turnOn();
    public abstract void turnOff();
}


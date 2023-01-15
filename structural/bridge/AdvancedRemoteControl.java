package structural.bridge;

public class AdvancedRemoteControl extends RemoteControl {

    private Device device;
    
    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    public void setChannel(int number) {
        device.setChannel(number);
    };

    
}

// should not do this
abstract class OldAdvancedRemoteControl extends OldRemoteControl {
    public abstract void setChannel(int number);
}

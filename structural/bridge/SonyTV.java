package structural.bridge;

public class SonyTV implements Device {

    @Override
    public void turnOn() {
        System.out.println("turnOn Sony");   
    }

    @Override
    public void turnOff() {
        System.out.println("turnOff Sony");
    }

    @Override
    public void setChannel(int number) {
        System.out.println("set channel Sony AdvanceRemoteControl"); 
    }
    
}

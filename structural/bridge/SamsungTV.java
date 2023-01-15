package structural.bridge;

public class SamsungTV implements Device {

    @Override
    public void turnOn() {
        System.out.println("turnOn Samsung");   
    }

    @Override
    public void turnOff() {
        System.out.println("turnOff Samsung");
    }

    @Override
    public void setChannel(int number) {
        System.out.println("set channel Samsung AdvanceRemoteControl"); 
    }
    
}

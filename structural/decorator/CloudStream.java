package structural.decorator;

public class CloudStream implements Stream {

    @Override
    public void write(String data) {
        System.out.println("Storing " + data);
    }
    
}

// should not do this
// with this class, we will read/write data to the cloud.
class OldCloudStream {
    public void write(String data) {
        System.out.println("Storing " + data);
    }
}

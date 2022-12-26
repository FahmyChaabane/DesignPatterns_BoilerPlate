package structural.decorator;

public class EncryptedCloudStream extends CloudStream {

    private Stream stream;

    public EncryptedCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        String encrypted = encrypt(data);
        stream.write(encrypted);
    }
    
    private String encrypt(String data) {
        return "çikf" + data + "df";
    }
}

// should not do this
class OldEncryptedCloudStream extends CloudStream {

    @Override
    public void write(String data) {
        String encrypted = encrypt(data);
        super.write(encrypted);
    }
    
    private String encrypt(String data) {
        return "çikfpzjdf";
    }
}

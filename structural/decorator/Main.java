package structural.decorator;

public class Main {

    public static void main(String[] args) {
        Stream cloudStream = new CloudStream();
        cloudStream.write("XXXXXXX");
        Stream encryptedCloudStream = new EncryptedCloudStream(cloudStream);
        encryptedCloudStream.write("XXXXXXX");
        Stream compressedCloudStream = new CompressedCloudStream(encryptedCloudStream);
        compressedCloudStream.write("XXXXXXX");
        System.out.println("~~~~~");
        Stream cCS = new CompressedCloudStream(new EncryptedCloudStream(new CloudStream()));
        cCS.write("XXXXXXX");
    }
    
}


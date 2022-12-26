package structural.decorator;

public class CompressedCloudStream extends CloudStream {

    private Stream stream;

    public CompressedCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        String compressed = compress(data);
        stream.write(compressed);
    }
    

    private String compress(String data) {
        return data.substring(2,5);
    }
}

// should not do this
class OldCompressedCloudStream extends CloudStream {

    @Override
    public void write(String data) {
        String compressed = compress(data);
        super.write(compressed);
    }
    

    private String compress(String data) {
        return data.substring(2,5);
    }
}

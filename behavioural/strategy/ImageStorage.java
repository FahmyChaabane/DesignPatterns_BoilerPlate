package strategy;

public class ImageStorage {
    private Compressor compressor;
    private Filter filter;

    public ImageStorage(Compressor compressor, Filter filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(String fileName) {
        compressor.compress();
        filter.apply();
    }
}

// we should not do this.
class OldImageStorage {
    private String compressor;
    private String filter;

    public OldImageStorage(String compressor, String filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(String fileName) {
        if(compressor == "jpeg") {
            System.out.println("Compressing using JPEG");
        } else if(compressor == "png") {
            System.out.println("Compressing using PNG");
        }

        if(filter == "b&w") {
            System.out.println("Filtering using B&W");
        } else if(filter == "high-contrast") {
            System.out.println("Filtering using HIGH-CONTRAST");
        }
    }
}

package strategy;

public class Main {
    public static void main(String[] args) {
        ImageStorage imageStorage = new ImageStorage(new PngCompressor(), new HighConstractFilter());
        imageStorage.store("user.pdf");
        // a better way to this, is to include the compressor and the filter in the store method as paramets.
        // This way we will not need to instantiate the imageStorage each time we want to change any of the compressor or the filter.
        // We only instantiate imageStorage once.
    }
}

package structural.proxy;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();
        // in real app, w would get this from a db
        String[] fileNames = {"a", "b", "c"};
        for(String filename: fileNames) {
            library.add(new EbookProxy(filename));
            // We change our app behiour by add a new class without modifiying any existing code. OCP
            // library.add(new LoggingEbookProxy(filename));
        }

        library.openEbook("a");
        library.openEbook("c");

    }
    
}


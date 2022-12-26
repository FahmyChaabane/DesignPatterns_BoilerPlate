package iterator;

public class Main {
    public static void main(String[] args) {
        BrowseHistory<String> browseHistory = new BrowseHistory<String>();
        browseHistory.push("A");
        browseHistory.push("B");
        browseHistory.push("C");

        Iterator<String> iterator = browseHistory.createIterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}

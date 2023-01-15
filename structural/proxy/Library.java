package structural.proxy;

import java.util.Map;
import java.util.HashMap;

public class Library {
    private Map<String, Ebook> ebooks = new HashMap<String, Ebook>();

    public void add(Ebook ebook) {
        if(!ebooks.containsKey(ebook.getFileName()))
            ebooks.put(ebook.getFileName(), ebook);
    }

    public void openEbook(String fileName) {
        ebooks.get(fileName).show();
    }

}

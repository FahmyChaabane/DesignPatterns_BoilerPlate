package iterator;

import java.util.ArrayList;
import java.util.List;

// in case we implement an array instead of list, only this class will have to change.
public class BrowseHistory<T> {
    private List<T> urls = new ArrayList<T>();

    public void push(T url) {
        urls.add(url);
    }

    public T pop() {
        int lastIndex = urls.size() - 1;
        T lastUrl = urls.get(lastIndex);
        urls.remove(lastUrl);

        return lastUrl;
    }

    public Iterator<T> createIterator() {
        return new ListIterator(this);
    }

    // will have to redone from scratch if we change the DS to an array.
    public class ListIterator implements Iterator<T> {

        private BrowseHistory<T> history;
        private int index;

        public ListIterator(BrowseHistory<T> history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return index < history.urls.size();
        }

        @Override
        public T current() {
            return history.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }

    }

}

// we should not do this
class OldBrowseHistory {
    private List<String> urls = new ArrayList<String>();

    public void push(String url) {
        urls.add(url);
    }

    public String pop() {
        int lastIndex = urls.size() - 1;
        String lastUrl = urls.get(lastIndex);
        urls.remove(lastUrl);

        return lastUrl;
    }

    public List<String> getUrls() {
        return urls;
    }
    
}
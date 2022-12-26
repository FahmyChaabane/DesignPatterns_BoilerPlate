package observer;

import java.util.ArrayList;
import java.util.List;

// Observable
public class Subject {
    
    private List<Observer> observers = new ArrayList<Observer>();
    
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // push style
    // public void notifyObservers(int value) {
    //     for(Observer obs : observers) {
    //         obs.update(value);
    //     }
    // }

    // pull style
    public void notifyObservers() {
        for(Observer obs : observers) {
            obs.update();
        }
    }
}

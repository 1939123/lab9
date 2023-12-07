package edu.kau.fcit.cpit252.subjects;
 
import edu.kau.fcit.cpit252.observers.Observer;

import java.util.ArrayList;
import java.util.List;

 
public class MessageSubject implements Subject {

    List<Observer> observers;

    public MessageSubject() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer o) {
        observers.add(o);
    }

    @Override
    public void unsubscribe(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyUpdate(String message) {
        for (Observer o: observers){
            o.update(message);
        }
    }
}

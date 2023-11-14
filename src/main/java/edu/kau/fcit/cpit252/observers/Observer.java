package edu.kau.fcit.cpit252.observers;

public abstract class Observer {
    private String recipient;

    public String getRecipient() {
        
    }

    public void setRecipient(String recipient) {

    }

    public abstract void update(String m);
}

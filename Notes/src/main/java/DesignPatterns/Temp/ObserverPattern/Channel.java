package DesignPatterns.Temp.ObserverPattern;

import java.util.ArrayList;

public class Channel implements Subject {

    /*              Instance Variables               */
    private ArrayList<Observer> observers;
    private String channelName;
    private String status;

    /*              Constructor                     */
    public Channel(String channelName, String status) {
        this.channelName = channelName;
        this.status = status;
        this.observers = new ArrayList<>();
    }


    /*              Methods                         */

    public String getStatus() { return status; }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) { observers.add(observer); }

    @Override
    public void removeObserver(Observer observer) { observers.remove(observer); }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(status);
        }
    }
}

package Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

interface Observer{
    void update(int stock);
}

class Customer implements Observer{

    @Override
    public void update(int stock) {

    }
}

interface Subject{
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

class Client implements Subject{

    private int stock;
    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer o: observers){
            o.update(stock);
        }
    }

    public void updateStock(int value) {
        stock = value;
        notifyObservers();
    }
}
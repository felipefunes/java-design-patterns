package com.design_patterns.observer_onefile;
import java.util.ArrayList;
import java.util.List;

 interface Observable {
  void subscribe(Observer observer);
  void unsubscribe(Observer observer);
  void notifyObservers(String message);
}

interface Observer {
  void update(String message);
}

class AmbarAlert implements Observable {
  private List<Observer> observers = new ArrayList<>();

  public void subscribe(Observer observer) {
    observers.add(observer);
  }

  public void unsubscribe(Observer observer) {
    observers.remove(observer);
  }

  public void notifyObservers(String message) {
    for (Observer observer : observers) {
      observer.update(message);
    }
  }

  public void kidLost(String kidName) {
    notifyObservers("Nuevo niño perdido de nombre: " + kidName);
  }

  public void kidFound(String kidName) {
    notifyObservers("Niño encontrado de nombre: " + kidName);
  }
}

class Citizen implements Observer {
  private String name;

  public Citizen(String name) {
    this.name = name;
  }

  public void update(String message) {
    System.out.println(name + " received: " + message);
  }
}

class Main {
  public static void main(String[] args) {
    AmbarAlert ambarAlert = new AmbarAlert();
    Observer citizen1 = new Citizen("John");
    ambarAlert.subscribe(citizen1);
    ambarAlert.kidLost("Juanito");
    ambarAlert.kidFound("Juanito");
  }
}

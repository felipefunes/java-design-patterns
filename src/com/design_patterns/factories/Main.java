package com.design_patterns.factories;

public class Main {
  public static void main(String[] args) {
    ComputerFactory laptopFactory = new LaptopComputerFactory();
    ComputerFactory desktopFactory = new DesktopComputerFactory();

    Computer laptop = laptopFactory.createComputer();
    Computer desktop = desktopFactory.createComputer();

    System.out.println(laptop.turnOn());
    System.out.println(desktop.turnOn());
  }
}

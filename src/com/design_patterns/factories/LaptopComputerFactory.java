package com.design_patterns.factories;

public class LaptopComputerFactory implements ComputerFactory {
  public Computer createComputer() {
    return new LaptopComputer();
  }
}

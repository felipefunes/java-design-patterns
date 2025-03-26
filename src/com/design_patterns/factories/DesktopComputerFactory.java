package com.design_patterns.factories;

public class DesktopComputerFactory implements ComputerFactory {
  public Computer createComputer() {
    return new DesktopComputer();
  }
}

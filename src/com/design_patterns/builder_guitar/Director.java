package com.design_patterns.builder_guitar;

public class Director {
  public void makeGuitar(GuitarBuilder guitarBuilder) {
    guitarBuilder.reset();
    guitarBuilder.setBody("Stratocaster");
    guitarBuilder.setNeck("Maple");
    guitarBuilder.setNumberOfStrings(6);
  }
}

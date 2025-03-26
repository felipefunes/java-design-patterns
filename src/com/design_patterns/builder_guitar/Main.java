package com.design_patterns.builder_guitar;

public class Main {
  public static void main(String[] args) {
    GuitarBuilder builder = new GuitarBuilder();
    Director director = new Director();

    director.makeGuitar(builder);
    Guitar guitar = builder.getGuitar();
    System.out.println(guitar.getTheGuitar());
  }
}

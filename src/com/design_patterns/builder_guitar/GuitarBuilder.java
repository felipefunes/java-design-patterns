package com.design_patterns.builder_guitar;

public class GuitarBuilder implements GuitarInterface {
  private Guitar guitar;

  public GuitarBuilder() {
    this.reset();
  }

  public void reset() {
    this.guitar = new Guitar();
  }

  public void setBody(String body) {
    this.guitar.setBody(body);
  }

  public void setNeck(String neck) {
    this.guitar.setNeck(neck);
  }

  public void setNumberOfStrings(int numberOfStrings) {
    this.guitar.setNumberOfStrings(numberOfStrings);
  }

  public Guitar getGuitar() {
    Guitar guitar = this.guitar;
    this.reset();
    return guitar;
  }
}

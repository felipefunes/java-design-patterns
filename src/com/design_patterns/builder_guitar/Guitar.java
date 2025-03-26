package com.design_patterns.builder_guitar;

public class Guitar {
  private String body;
  private String neck;
  private int numberOfStrings;

  public void setBody(String body) {
    this.body = body;
  }

  public void setNeck(String neck) {
    this.neck = neck;
  }

  public void setNumberOfStrings(int numberOfStrings) {
    this.numberOfStrings = numberOfStrings;
  }

  public String getTheGuitar() {
    return "The guitar has a " + body + " body and a " + neck + " neck. It has " + numberOfStrings + " strings.";
  }
}

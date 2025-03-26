package com.design_patterns.builder_caja_navidad;

public class CajaNavidad {
  private int colaDeMonoCc;
  private int panettoneGr;
  private int juguitoCc;
  private int pavoKg;


  public void addColaDeMonoCc(int colaDeMonoCc) {
    this.colaDeMonoCc = colaDeMonoCc;
  }
  public void addPanettoneGr(int panettoneGr) {
    this.panettoneGr = panettoneGr;
  }
  public void addJuguitoCc(int vinoTintoCc) {
    this.juguitoCc = vinoTintoCc;
  }
  public void addPavoKg(int pavoKg) {
    this.pavoKg = pavoKg;
  }

  public void showCaja() {
    System.out.println("Caja de Navidad:");
    System.out.println("Cola de mono: " + colaDeMonoCc + " cc");
    System.out.println("Panettone: " + panettoneGr + " gr");
    System.out.println("Juguito: " + juguitoCc + " cc");
    System.out.println("Pavo: " + pavoKg + " kg");
  }
}

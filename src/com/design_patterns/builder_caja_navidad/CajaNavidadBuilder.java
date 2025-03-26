package com.design_patterns.builder_caja_navidad;

public class CajaNavidadBuilder implements CajaInterface {
  private CajaNavidad cajaNavidad;

  public CajaNavidadBuilder() {
    this.reset();
  }

  public void reset() {
    this.cajaNavidad = new CajaNavidad();
  }

  @Override
  public void addColaDeMonoCc(int colaDeMonoCc) {
    this.cajaNavidad.addColaDeMonoCc(colaDeMonoCc);
  }

  @Override
  public void addPanettoneGr(int panettoneGr) {
    this.cajaNavidad.addPanettoneGr(panettoneGr);
  }

  @Override
  public void addJuguitoCc(int juguitoCc) {
    this.cajaNavidad.addJuguitoCc(juguitoCc);
  }

  @Override
  public void addPavoKg(int pavoKg) {
    this.cajaNavidad.addPavoKg(pavoKg);
  }

  public CajaNavidad build() {
    return this.cajaNavidad;
  }
}

package com.design_patterns.builder_caja_navidad;

public class Director {
  public void constructCajaNavidadChica(CajaInterface builder) {
    builder.reset();
    builder.addColaDeMonoCc(750);
    builder.addPanettoneGr(1000);
    builder.addJuguitoCc(1000);
    builder.addPavoKg(2);
  }

  public void constructCajaNavidadGrande(CajaInterface builder) {
    builder.reset();
    builder.addColaDeMonoCc(1000);
    builder.addPanettoneGr(1500);
    builder.addJuguitoCc(1500);
    builder.addPavoKg(3);
  }
}

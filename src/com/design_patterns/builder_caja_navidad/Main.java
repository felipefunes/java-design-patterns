package com.design_patterns.builder_caja_navidad;

public class Main {
  public static void main(String[] args) {
    Director director = new Director();
    CajaNavidadBuilder cajaNavidadBuilder = new CajaNavidadBuilder();
    CajaNavidadBuilder cajaNavidadBuilder2 = new CajaNavidadBuilder();

    director.constructCajaNavidadChica(cajaNavidadBuilder);
    cajaNavidadBuilder.build().showCaja();

    director.constructCajaNavidadGrande(cajaNavidadBuilder2);
    cajaNavidadBuilder2.build().showCaja();
  }
}

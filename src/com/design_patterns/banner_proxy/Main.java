package com.design_patterns.banner_proxy;

public class Main {
  public static void main(String[] args) {
    BannerProxy bannerProxy = new BannerProxy("Zapatillas running", "zapatilla.jpg", "ADIDAS", "10% de descuento");
    bannerProxy.showBanner();
    bannerProxy.showBanner();
  }
}

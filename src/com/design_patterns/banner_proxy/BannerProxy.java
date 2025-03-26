package com.design_patterns.banner_proxy;

public class BannerProxy implements BannerInterface {
  private String title;
  private String image;
  private String volanta;
  private String ctr;
  private boolean isLoaded;
  private Banner banner;

  public BannerProxy(String title,
                     String image,
                     String volanta,
                     String ctr) {
    this.title = title;
    this.image = image;
    this.volanta = volanta;
    this.ctr = ctr;
    this.isLoaded = false;
  }

  public boolean isLoaded() {
    return this.isLoaded;
  }

  public void showBanner() {
    if (banner == null) {
      banner = new Banner(title, image, volanta, ctr);
    } else {
      this.isLoaded = true;
    }
    System.out.println("Loaded: " + this.isLoaded());
    banner.showBanner();
  }
}

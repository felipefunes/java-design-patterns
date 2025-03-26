package com.design_patterns.banner_proxy;

public class Banner implements BannerInterface {
  private String title;
  private String image;
  private String volanta;
  private String ctr;
  private boolean isLoaded = false;

  public Banner(String title,
                String image,
                String volanta,
                String ctr) {
    this.title = title;
    this.image = image;
    this.volanta = volanta;
    this.ctr = ctr;
  }

  public void showBanner() {
    System.out.println("Bannert title: " + title + " image: " + image + " volanta: " + volanta + " ctr: " + ctr);
  }
}

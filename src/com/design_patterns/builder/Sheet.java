package com.design_patterns.builder;

public class Sheet {
  private String title;
  private String artist;
  private String format;

  // Setters
  public void setTitle(String title) {
      this.title = title;
  }

  public void setArtist(String artist) {
      this.artist = artist;
  }

  public void setFormat(String format) {
      this.format = format;
  }

  @Override
  public String toString() {
      return "Sheet [Title=" + title + ", Artist=" + artist + ", Format=" + format + "]";
  }
}

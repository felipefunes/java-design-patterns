package com.design_patterns.builder;

public class Recording {
  private String title;
  private String artist;
  private int duration; // en segundos
  private String format;

  public void setTitle(String title) {
      this.title = title;
  }

  public void setArtist(String artist) {
      this.artist = artist;
  }

  public void setDuration(int duration) {
      this.duration = duration;
  }

  public void setFormat(String format) {
      this.format = format;
  }

  @Override
  public String toString() {
      return "Recording [Title=" + title + ", Artist=" + artist + ", Duration=" + duration + " seconds, Format=" + format + "]";
  }
}

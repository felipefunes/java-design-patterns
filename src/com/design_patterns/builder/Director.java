package com.design_patterns.builder;

public class Director {
  public void constructClassicSheet(SongBuilder builder) {
    builder.reset();
    builder.setTitle("Moonlight Sonata");
    builder.setArtist("Ludwig van Beethoven");
    builder.setFormat("PDF");
  }

  public void constructPopRecording(SongBuilder builder) {
    builder.reset();
    builder.setTitle("Shape of You");
    builder.setArtist("Ed Sheeran");
    builder.setDuration(233);
    builder.setFormat("MP3");
  }
}

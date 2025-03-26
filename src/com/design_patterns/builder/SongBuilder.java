package com.design_patterns.builder;

public interface SongBuilder {
  void reset();
  void setTitle(String title);
  void setArtist(String artist);
  void setDuration(int duration); // Duración en segundos
  void setFormat(String format);  // Ej: "MP3", "PDF", etc.
}


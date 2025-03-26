package com.design_patterns.builder;

public class SheetBuilder implements SongBuilder{
  private Sheet sheet;

  public SheetBuilder() {
      this.reset();
  }

  @Override
  public void reset() {
      this.sheet = new Sheet();
  }

  @Override
  public void setTitle(String title) {
      this.sheet.setTitle(title);
  }

  @Override
  public void setArtist(String artist) {
      this.sheet.setArtist(artist);
  }

  @Override
  public void setDuration(int duration) {
      // No se usa en Sheet
  }

  @Override
  public void setFormat(String format) {
      this.sheet.setFormat(format);
  }

  public Sheet getProduct() {
      return this.sheet;
  }
}

package com.design_patterns.builder;

public class RecordingBuilder implements SongBuilder {
  private Recording recording;

  public RecordingBuilder() {
      this.reset();
  }

  @Override
  public void reset() {
      this.recording = new Recording();
  }

  @Override
  public void setTitle(String title) {
      this.recording.setTitle(title);
  }

  @Override
  public void setArtist(String artist) {
      this.recording.setArtist(artist);
  }

  @Override
  public void setDuration(int duration) {
      this.recording.setDuration(duration);
  }

  @Override
  public void setFormat(String format) {
      this.recording.setFormat(format);
  }

  public Recording getProduct() {
      return this.recording;
  }
}

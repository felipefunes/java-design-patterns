package com.design_patterns.builder;

public class Main {
  public static void main(String[] args) {
    Director director = new Director();

    // Construir una partitura
    SheetBuilder sheetBuilder = new SheetBuilder();
    director.constructClassicSheet(sheetBuilder);
    Sheet sheet = sheetBuilder.getProduct();
    System.out.println(sheet);

    // Construir una grabación
    RecordingBuilder recordingBuilder = new RecordingBuilder();
    director.constructPopRecording(recordingBuilder);
    Recording recording = recordingBuilder.getProduct();
    System.out.println(recording);
  }
}

package com.design_patterns.singleton;

public class Database {
  private static Database instance;
  private String name;

  private Database(String name) {
    this.name = name;
  }

  public static Database getInstance(String name) {
    if (instance == null) {
      instance = new Database(name);
    }
    return instance;
  }

  public String getName() {
    return name;
  }
}

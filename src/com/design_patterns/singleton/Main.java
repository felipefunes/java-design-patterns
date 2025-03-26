package com.design_patterns.singleton;

public class Main {
  public static void main(String[] args) {
    Database database1 = Database.getInstance("db1");
    Database database2 = Database.getInstance("db2");

    System.out.println(database1.getName());
    System.out.println(database2.getName());
  }
}

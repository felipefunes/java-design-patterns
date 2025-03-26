package com.design_patterns.one_file_singleton;

class CloudConnection {
  private String name;
  private static CloudConnection instance;

  public String name() {
    return this.name;
  }

  private CloudConnection(String name) {
    this.name = name;
  }

  public static CloudConnection getInstance(String name) {
    if (instance == null) {
      return instance = new CloudConnection(name);
    } else {
      return instance;
    }
  }
}

class Main {
  public static void main(String[] args) {
    CloudConnection cloudConnection = CloudConnection.getInstance("AWS");
    CloudConnection cloudConnection2 = CloudConnection.getInstance("GCP");
    System.out.println(cloudConnection2 == cloudConnection);
    System.out.println("name" + cloudConnection.name());
    System.out.println("name 2" + cloudConnection2.name());
  }
}

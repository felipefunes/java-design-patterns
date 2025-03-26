package com.design_patterns.banner_onefile_proxy;

interface PersonalInfo {
  boolean savePersonalInfo();
}

class UserInfo implements PersonalInfo {
  private String name;
  private String email;
  private int age;
  private String phone;


  public UserInfo(String name, String email, int age, String phone) {
    this.name = name;
    this.email = email;
    this.age = age;
    this.phone = phone;
  }

  public int getAge() {
    return this.age;
  }

  public String getEmail() {
    return this.email;
  }

  public String getPhone() {
    return this.phone;
  }

  public boolean savePersonalInfo() {
    System.out.println("Name: " + name + " Email: " + email + " Age: " + age + " Phone: " + phone);
    return true;
  }
}

class UserInfoProxy implements PersonalInfo {
  private UserInfo userInfo;

  public UserInfoProxy(String name, String email, int age, String phone) {
    this.userInfo = new UserInfo(name, email, age, phone);
  }

  private boolean isValid() {
    if (this.userInfo.getAge() < 18) return false;
    if (this.userInfo.getPhone().length() < 9) return false;
    if (!this.userInfo.getEmail().contains("@")) return false;
    return true;
  }

  public boolean savePersonalInfo() {
    boolean isValid = this.isValid();
    System.out.println("Is valid: " + isValid);

    if (isValid) {
      return this.userInfo.savePersonalInfo();
    } else {
      return false;
    }
  }
}

class Main {
  public static void main(String[] args) {
    PersonalInfo userInfo = new UserInfoProxy("John", "jon@coketo.com", 20, "123456789");
    userInfo.savePersonalInfo();
  }
}

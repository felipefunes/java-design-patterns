package com.design_patterns.template_onefile;

abstract class Payment {
  private int amount;
  private String transactionId;

  public Payment(int amount, String transactionId) {
    this.amount = amount;
    this.transactionId = transactionId;
  }

  public boolean pay() {
    System.out.println("Payment with " + getPaymentType());
    System.out.println("Taxes amount: " + getTaxesAmount());
    System.out.println("Amount: " + amount);
    System.out.println("Transaction ID: " + transactionId);
    return true;
  }

  abstract String getPaymentType();
  abstract int getTaxesAmount();
}

class CreditCard extends Payment {

  public CreditCard(int amount, String transactionId) {
    super(amount, transactionId);
  }

  String getPaymentType() {
    return "credit card";
  }

  int getTaxesAmount() {
    return 10;
  }
}

class MercadoPago extends Payment {

  public MercadoPago(int amount, String transactionId) {
    super(amount, transactionId);
  }

  String getPaymentType() {
    return "MercadoPago";
  }

  int getTaxesAmount() {
    return 3;
  }
}

public class Main {
  public static void main(String[] args) {
    Payment myPayment = new MercadoPago(100, "123456789");
    myPayment.pay();
  }
}

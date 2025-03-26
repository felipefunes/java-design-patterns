public interface ProductInterface {
  public ProductBuilder setPrice(int price);
  public ProductBuilder setBrand(String brand);
  public ProductBuilder setName(String name);
}

public class Product {
  private int price;
  private String brand;
  private String name;

  public Product(ProductBuilder builder) {
    this.price = builder.getPrice();
    this.brand = builder.getBrand();
    this.name = builder.getName();
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getProduct() {
    return "Product: " + this.name + " " + this.brand + " " + this.price;
  }
}

public class ProductBuilder implements ProductInterface{
  private int price;
  private String brand;
  private String name;

  public ProductBuilder setPrice(int price) {
    this.price = price;
    return this;
  }

  public ProductBuilder setBrand(String brand) {
    this.brand = brand;
    return this;
  }

  public ProductBuilder setName(String name) {
    this.name = name;
    return this;
  }
  public int getPrice() {
    return this.price;
  }

  public String getBrand() {
    return this.brand;
  }

  public String getName() {
    return this.name;
  }

  public Product build() {
    return new Product(this);
  }
}

public class Main {
  public static void main(String[] args) {
    ProductBuilder productBuilder = new ProductBuilder();
    Product product = productBuilder
      .setPrice(100)
      .setBrand("Nike")
      .setName("Zapatillas")
      .build();
    System.out.println(product.getProduct());
  }
}

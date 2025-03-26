package com.design_patterns.one_file_decorator;
interface Image {
  String display();
}

class BaseImage implements Image {
  protected String colorScheme;

  public BaseImage(String colorScheme) {
    this.colorScheme = colorScheme;
  }

  @Override
  public String display() {
    return colorScheme;
  }
}

class BlackAndWhiteImageDecorator implements Image {
  protected Image image;

  public BlackAndWhiteImageDecorator(Image image) {
    this.image = image;
  }

  @Override
  public String display() {
    return "black and white over " + this.image.display();
  }
}

class Main {
  public static void main(String[] args) {
    Image image = new BaseImage("rgb");
    System.out.println(image.display());

    Image blackAndWhiteImage = new BlackAndWhiteImageDecorator(image);
    System.out.println(blackAndWhiteImage.display());
  }
}

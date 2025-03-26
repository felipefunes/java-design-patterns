interface Sheeping {
  public double cost();
}

class BaseSheeping implements Sheeping {
  public double cost;
  public BaseSheeping(double cost) {
    this.cost = cost;
  }

  @Override
  public double cost() {
    return cost;
  }
}

abstract class SheepingDecorator implements Sheeping {
  protected Sheeping sheeping;

  public SheepingDecorator(Sheeping sheeping) {
    this.sheeping = sheeping;
  }

  @Override
  public double cost() {
    return this.sheeping.cost();
  }
}

class SameCitySheepingDecorator extends SheepingDecorator {
  public SameCitySheepingDecorator(Sheeping sheeping) {
    super(sheeping);
  }

  public double cost() {
    return super.cost() + 0.5;
  }
}

class OtheCitySameCountrySheepingDecorator extends SheepingDecorator {
  public OtheCitySameCountrySheepingDecorator(Sheeping sheeping) {
    super(sheeping);
  }

  public double cost() {
    return super.cost() + 1.0;
  }
}

class withTaxesSheepingDecorator extends SheepingDecorator {
  public withTaxesSheepingDecorator(Sheeping sheeping) {
    super(sheeping);
  }

  public double cost() {
    return super.cost() * 1.18;
  }
}

class OtherCountrySheepingDecorator extends SheepingDecorator {
  public OtherCountrySheepingDecorator(Sheeping sheeping) {
    super(sheeping);
  }

  public double cost() {
    return super.cost() + 1.5;
  }
}

class Main {
  public static void main(String[] args) {
    Sheeping sheeping = new BaseSheeping(10.0);
    System.out.println(String.format("Base cost: %s", sheeping.cost()));
    Sheeping otherCouSheeping = new OtherCountrySheepingDecorator(sheeping);
    System.out.println(String.format("Other country cost: %s", otherCouSheeping.cost()));
    Sheeping withTaxesSheeping = new withTaxesSheepingDecorator(otherCouSheeping);
    System.out.println(String.format("Other country With taxes cost: %s", withTaxesSheeping.cost()));
  }
}

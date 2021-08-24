class Noodle {

  //instance fields
  protected double lengthInCentimeters;
  protected double widthInCentimeters;
  protected String shape;
  protected String ingredients;
  protected String texture = "brittle";

  //Noodle contructor
  Noodle(double lenInCent, double wthInCent, String shp, String ingr) {

    this.lengthInCentimeters = lenInCent;
    this.widthInCentimeters = wthInCent;
    this.shape = shp;
    this.ingredients = ingr;

  }

  //default method used for all kinds of noodles
  public String getCookPrep() {

    return "Boil noodle for 7 minutes and add sauce.";

  }

}

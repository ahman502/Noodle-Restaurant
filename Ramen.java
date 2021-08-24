class Ramen extends Noodle {

  Ramen() {
    //Ramen calls the constructor of the super class (Noodle, in this case) and passes it's own porpeties into the constructor
    super(30.0, 0.3, "flat", "wheat flour");

  }

  //here we do some method overriding to give the customer directions for a specific kind of noodle (Ramen, in this case)
  @Override
  public String getCookPrep() {

    return "Boil ramen for 5 minutes in broth, then add meat, mushrooms, egg, and vegetables.";

  }

}

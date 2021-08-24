class Pho extends Noodle {

  Pho() { 
    //Pho calls the contructor of the super class (Noodle, in this case) and passes it's own porpeties into the constructor
    super(30.0, 0.64, "flat", "rice flour");

  }

  //here we do some method overriding to give the customer directions for a specific kind of noodle (Pho, in this case)
  @Override
  public String getCookPrep() {

    return "Soak pho for 1 hour, then boil for 1 minute in broth. Then garnish with cilantro and jalapeno.";

  }

}

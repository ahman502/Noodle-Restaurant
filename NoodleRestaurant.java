class NoodleRestaurant {
  String name;

  //noodlerestaurant constructor
  public NoodleRestaurant(String customerName){
    name = customerName;
  }

  //passing noodle object as an argument 
  public void order(Noodle noodle) {
    System.out.println(noodle.getCookPrep());
    System.out.println("Order for " + name + " is ready.");
  }

  public static void main(String[] args) {
    //creating new instance of Ramen noodle and Pho noodle
    Noodle ramen, pho;
    ramen = new Ramen();
    pho = new Pho();

    //passing two new customers' names
    NoodleRestaurant customer1 = new NoodleRestaurant("Sagirah");
    NoodleRestaurant customer2 = new NoodleRestaurant("Maritza");

   
    //customer 1 has ordered pho so the getCookPrep() method for pho will be called
    customer1.order(pho);
    //customer 2 has ordered ramen so the getCookPrep() method for ramen will be called
    customer2.order(ramen);


  }
}

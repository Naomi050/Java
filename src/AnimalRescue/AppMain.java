package AnimalRescue;

public class AppMain {

 public static void main(String[] args) {
  Cat fofo = new Cat();
  fofo.setName("Fofo");
  System.out.println(fofo.getName());
  fofo.setAge(3);
  System.out.println(fofo.getAge());
  fofo.setColor("White");
  System.out.println(fofo.getColor());
  fofo.setGender("female");
  System.out.println(fofo.getGender());
  fofo.setWeight(2);
  System.out.println(fofo.getWeight());
  fofo.setHungerlevel(5);
  System.out.println(fofo.getHungerlevel());
  fofo.setMoodlevel(90);
  System.out.println(fofo.getMoodlevel());
  fofo.setThefoodname("milk with milk");
  System.out.println(fofo.getThefoodname());
  fofo.setThelevelofhealth(95);
  System.out.println(fofo.getThelevelofhealth());
  fofo.setThenameoftherecreationalactivity("to play in the water");
  System.out.println(fofo.getThenameoftherecreationalactivity());


  CatFood food = new CatFood();
  food.setThefoodname("Tigerino");
  System.out.println(food.getThefoodname());
  food.setTheprice("50$");
  System.out.println(food.getTheprice());
  food.setAmount("3kg");
  System.out.println(food.getAmount());
  food.setStock("900kg");
  System.out.println(food.getStock());

  RecreationalActivity one = new RecreationalActivity();
  one.setName("Balls");
  System.out.println(one.getName());

  Veterinarian medic = new Veterinarian();
  medic.setName(("John"));
  System.out.println(medic.getName());
  medic.setSpecialty("internal medicine");
  System.out.println(medic.getSpecialty());


  Adopter adopter = new Adopter();
  adopter.setName("James");
  System.out.println(adopter.getName());
  adopter.setTheamountofmoneyavailable("3000$");
  System.out.println(adopter.getTheamountofmoneyavailable());
 }
}

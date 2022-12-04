package AnimalRescue;

public class AppMain {

 public static void main(String[] args) {
  Dog g = new Rex();
  g.name();
  g.age();
  g.color();
  g.weight();
  g.gender();
  g.hungerlevel();
  g.moodlevel();
  g.thelevelofhealth();
  g.thenameoftherecreatnalactivity();


  System.out.println();
  Cat fofo = new Cat();
  fofo.setName(" NAME: Fofo");
  System.out.println(fofo.getName());
  fofo.setAge(3);
  System.out.println(fofo.getAge());
  fofo.setColor(" COLOR: White");
  System.out.println(fofo.getColor());
  fofo.setGender(" GENDER: female");
  System.out.println(fofo.getGender());
  fofo.setWeight(2);
  System.out.println(fofo.getWeight());
  fofo.setHungerlevel(5);
  System.out.println(fofo.getHungerlevel());
  fofo.setMoodlevel(90);
  System.out.println(fofo.getMoodlevel());
  fofo.setThefoodname(" FOOD: milk with milk");
  System.out.println(fofo.getThefoodname());
  fofo.setThelevelofhealth(95);
  System.out.println(fofo.getThelevelofhealth());
  fofo.setThenameoftherecreationalactivity("FAVORITE GAME: to play in the water");
  System.out.println(fofo.getThenameoftherecreationalactivity());
//
//
//  CatFood food = new CatFood();
//  food.setThefoodname("Tigerino");
//  System.out.println(food.getThefoodname());
//  food.setTheprice("50$");
//  System.out.println(food.getTheprice());
//  food.setAmount("3kg");
//  System.out.println(food.getAmount());
//  food.setStock("900kg");
//  System.out.println(food.getStock());
//
//  RecreationalActivity one = new RecreationalActivity();
//  one.setName("Balls");
//  System.out.println(one.getName());
//
//  Veterinarian medic = new Veterinarian();
//  medic.setName(("John"));
//  System.out.println(medic.getName());
//  medic.setSpecialty("internal medicine");
//  System.out.println(medic.getSpecialty());
//
//
//  Adopter adopter = new Adopter();
//  adopter.setName("James");
//  System.out.println(adopter.getName());
//  adopter.setTheamountofmoneyavailable("3000$");
//  System.out.println(adopter.getTheamountofmoneyavailable());
//  System.out.println();
//  System.out.println();
//
//
//


  Dog dog = new Dog();
  dog.setName("The dog's name is Rex");
  System.out.println(dog.getName());
  dog.setAge(5);
  System.out.println(dog.getAge());
  dog.setColor("The dog's color is brown");
  System.out.println(dog.getColor());
  dog.setGender("The dog's gender is male");
  System.out.println(dog.getGender());
  dog.setWeight(6);
  System.out.println(dog.getWeight());
  System.out.println();
  System.out.println();


  Hen hen = new Hen();
  hen.setName("The hen's name is Charlie ");
  System.out.println(hen.getName());
  hen.setColor("The hen's color is orange");
  System.out.println(hen.getColor());
  hen.setAge(2);
  System.out.println(hen.getAge());
  hen.setGender("The hen's gender is female");
  System.out.println(hen.getGender());
  hen.setWeight(1);
  System.out.println(hen.getWeight());
  System.out.println();
  System.out.println();


  Lamb lamb = new Lamb();
  lamb.setName("The lamb's name is Molly ");
  System.out.println(lamb.getName());
  lamb.setColor("The lamb's clor is white");
  System.out.println(lamb.getColor());
  lamb.setGender("The lamb's gender is female");
  System.out.println(lamb.getGender());
  lamb.setAge(3);
  System.out.println(lamb.getAge());
  lamb.setWeight(2);
  System.out.println(lamb.getWeight());
  System.out.println();
  System.out.println();


  Rabit rabit = new Rabit();
  rabit.setName("The rabit's name is Dotty");
  System.out.println(rabit.getName());
  rabit.setColor("The rabit's color is gray");
  System.out.println(rabit.getColor());
  rabit.setGender("The rabit's gender is male");
  System.out.println(rabit.getGender());
  rabit.setAge(4);
  System.out.println(rabit.getAge());
  rabit.setWeight(5);
  System.out.println(rabit.getWeight());

 }





}

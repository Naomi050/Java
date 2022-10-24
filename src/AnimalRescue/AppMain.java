package AnimalRescue;

public class AppMain {

    public static void main(String[] args) {
        Cat fofo = new Cat();
        System.out.println(fofo.name);
        System.out.println(fofo.age);
        System.out.println(fofo.thelevelofhealth);
        System.out.println(fofo.hungerlevel);
        System.out.println(fofo.thefoodname);
        System.out.println(fofo.moodlevel);
        System.out.println(fofo.thenameoftherecreationalactivity);

        CatFood food = new CatFood();
        System.out.println(food.thefoodname);
        System.out.println(food.theprice);
        System.out.println(food.amount);
        System.out.println(food.stock);

        RecreationalActivity one = new RecreationalActivity();
        System.out.println(one.name);

        Veterinarian medic = new Veterinarian();
        System.out.println(medic.name);
        System.out.println(medic.specialty);

        Adopter adopter = new Adopter();
        System.out.println(adopter.name);
        System.out.println(adopter.theamountofmoneyavailable);
    }
}

package AnimalRescue;

public class Hen extends Animal {


    @Override
    public void eat() {
        System.out.println("The hen eats more cereals");

    }

    @Override
    public void speak() {
        System.out.println("The hen says: CotCotCotCotCotcoooooodac");

    }

    @Override
    public void sleep() {
        System.out.println("The hen sleeps:......");

    }

    @Override
    public void run() {
        System.out.println("The hen flies to be fast");

    }
}

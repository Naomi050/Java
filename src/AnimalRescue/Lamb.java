package AnimalRescue;

public class Lamb extends Animal{
    @Override
    public void eat() {
        System.out.println("The lamb eats more milk");

    }

    @Override
    public void speak() {
        System.out.println("The lamb says: beee beee bee");

    }

    @Override
    public void sleep() {
        System.out.println("The lamb sleeps: ZZZZzzzzZZZzz");
    }



    @Override
    public void run() {
        System.out.println("The lamb runs merrily");
    }

    }




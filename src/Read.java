import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Read {
    //ex 1
    public int getNumber() {
        Scanner scan = new Scanner(System.in);
        boolean repeat = true;
        int y = 0;
        while (repeat) {
            try {
                System.out.println("Enter a number: ");
                y = scan.nextInt();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("It's not a valid value, try again");
            }

        }

        return y;
    }


    //ex2
    public double getNumber2() {
        Scanner scan = new Scanner(System.in);
        boolean repeat = true;
        double number = 0;
        while (repeat) {
            try {
                System.out.println("Enter a number: ");
                number = scan.nextDouble();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("It's not valid value.");
            }

        }

        return number;

    }

    public float getNuber3() {
        Scanner scan = new Scanner(System.in);
        boolean repeat = true;
        float x = 0;
        while (repeat) {
            try {
                System.out.println("Enter a number: ");
                x = scan.nextFloat();
                repeat= false;
            } catch (InputMismatchException e) {
                System.out.println("It's not valid value.");
            }
        }
        return x;
    }


    public long getNumber4() {
        Scanner scan = new Scanner(System.in);
        boolean repeat = true;
        long z = 0;
        while (repeat) {
            try {
                System.out.println("Enter a number: ");
                z = scan.nextLong();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("It's not valid value");
            }
        }
        return z;


    }

  //ex3
      public int[] getArray (int lenght){
            int[] array = new int[lenght];
            for(int i = 0; i < lenght; i++){
                array[i] = getNumber();
            }
            return array;
        }



        //ex4
        public List<Integer> getaList(){

            List<Integer> list = new ArrayList<>();
            while(true){
                try{
                    System.out.print("Enter a number: ");
                    Scanner scanner =new Scanner(System.in);
                    int number = scanner.nextInt();
                    list.add(number);
                }catch (InputMismatchException e){
                    System.out.println("It's not a valid value.");
                    break;
                }
            }
            return list;
        }


        //ex5
        public void DisaplayArrayInIndex(int[] anArray, int nr){
            try{
                System.out.println(anArray[nr]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Inside catch, number too large");
            }
        }
    //ex6



    }







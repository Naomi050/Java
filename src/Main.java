public class Main {

    public static void main(String[] args) {
        Calculator obiect = new Calculator();
        System.out.println(obiect.printSum());
        System.out.println(obiect.printDivide());
        System.out.println(obiect.multiply());
        LogicalOp number = new LogicalOp();
        System.out.println( " The bigger number is :" + number.checkBiggerNumber(9, 7));
        System.out.println(number.textcomp("FastTrackIT"));
        System.out.println(number.comparison("FastTrackIT", 3));
        System.out.println(number.comparison2(7));
        System.out.println(number.comparison3(9));
        System.out.println(number.chocolateString(35));
        System.out.println(number.isNumberEven(12));
        System.out.println(number.isEligibleVote(16));
        System.out.println();

        NumeleMeu();

        int a = 9;
        int b = 13;
        printSum(a, b);

        int c = 12;
        int d = 2;
        printDivide(c, d);

        int e = -5;
        int f = 8;
        int g = 6;
        ex4a(e, f, g);

        int h = 55;
        int i = 9;
        int j = 9;
        ex4b(h, i, j);

        float k = 20;
        float l = -3;
        float m = 5;
        float n = 8;
        ex4c(k, l, m, n);

        float o = 5;
        float p = 15;
        float q = 3;
        float r = 2;
        float s = 8;
        float t = 3;
        ex4d(o, p, q, r, s, t);

        long primul = 34553;
        long aldoilea = 27892;
        sum(primul, aldoilea);
        System.out.println("Rezultatul adunarii este:" + sum(primul, aldoilea));

        float unnumar = 456;
        float douanumere = 245;
        substract(unnumar, douanumere);
        System.out.println("Rezultatul scaderii este:" + substract(unnumar, douanumere));

        long first = 23678;
        long second = 34678;
        multiply(first, second);
        System.out.println("Rezultatul inmultirii este:" + multiply(first, second));

        int impartitor = 56;
        int deimpartitul = 8;
        divide(impartitor, deimpartitul);
        System.out.println("Rezultatul impartirii este:" + divide(impartitor, deimpartitul));

        JavaPrint();

        float numere = 14;
        float cifre = 9;
        float media = 2;
        System.out.println("Media numerelor este:" + average(numere, cifre, media));

        ModelPrint();

        // exercitiul 6
        {
            int x = 27;
            int y = 6;
            int remainder = remainder(x, y);
            System.out.println("Restul impartii este:" + remainder);
        }

        // exercitiul 7
        {
            float fahrenheit = 36;
            float celsius = fahrenheitToCelsius(fahrenheit);
            System.out.println("Temperatura in celsius este:" + celsius);
        }
        //ex8
        double inch = 130.15;
        double meters = inchTometers(inch);
        System.out.println("Distanta in metrii este:" + meters);








    }

    // ex2
    private static float substract(float unnumar, float douanumere) {
        float result = unnumar - douanumere;
        return result;
    }

    // ex1
    public static void NumeleMeu() {
        System.out.println("Hello Naomi");
    }

    //ex2-lab 9
    public static void printSum(int nr1, int nr2) {
        int result = nr1 + nr2;
        System.out.println(result);
    }


    //ex3-lab 9
    public static void printDivide(int nr1, int nr2) {
        int result = nr1 / nr2;
        System.out.println(result);
    }


    // ex4a-lab 9
    public static void ex4a(int nr1, int nr2, int nr3) {
        int result = -nr1 + nr2 * nr3;
        System.out.println(result);
    }

    // ex4b- lab 9
    public static void ex4b(int nr1, int nr2, int nr3) {
        int result = (nr1 + nr2) % nr3;
        System.out.println(result);
    }


    //ex4c-lab 9
    public static void ex4c(float nr1, float nr2, float nr3, float nr4) {
        float result = nr1 + (-nr2 * nr3 / nr4);
        System.out.println(result);

    }


    //ex4d-lab 9
    public static void ex4d(float nr1, float nr2, float nr3, float nr4, float nr5, float nr6) {
        float result = nr1 + (nr2 / nr3 * nr4) - nr5 % nr6;
        System.out.println(result);
    }


    // ex2
    public static long sum(long primul, long aldoilea) {
        long result = primul + aldoilea;
        return result;
    }


    //ex2
    public static long multiply(long first, long second) {
        long result = first * second;
        return result;
    }


    //ex2
    public static int divide(int impartitor, int deimpartitul) {
        int result = impartitor / deimpartitul;
        return result;
    }


    //ex3
    public static void JavaPrint() {
        System.out.println("      J     a    v     v    a" +
                "                 J    a a    v   v    a a" +
                "             J   J   aaaaa    v v    aaaaa" +
                "              J J   a     a    v    a     a");


    }

    //ex4
    public static float average(float numere, float cifre, float media) {
        float result = (numere + cifre) / media;
        return result;
    }


    //ex5
    public static void ModelPrint() {
        System.out.println("    + ''''' + " +
                "             [ | o   o | ]" +
                "               |   ^   |  " +
                "               |  '_'  | " +
                "               +-------+ ");
    }


    //ex6
    public static int remainder(int x, int y) {
        int result = x % y;
        return result;
    }

    //ex7
    public static float fahrenheitToCelsius(float fahrenheit) {
        float result = 5 / 9 * (fahrenheit - 32);
        return result;

    }


    //ex8
    public static double inchTometers(double inch) {
        double result = inch / 39.370;
        return result;
    }









}









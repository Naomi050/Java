public class Main {

    public static void main(String[] args) {
        Calculator obiect = new Calculator();
        System.out.println(obiect.printSum());
        System.out.println(obiect.printDivide());
        System.out.println(obiect.multiply());
        LogicalOp number = new LogicalOp();
        System.out.println(" The bigger number is :" + number.checkBiggerNumber(9, 7));
        System.out.println(number.textcomp("FastTrackIT"));
        System.out.println(number.comparison("FastTrackIT", 3));
        System.out.println(number.comparison2(7));
        System.out.println(number.comparison3(9));
        System.out.println(number.chocolateString(35));
        System.out.println(number.isNumberEven(12));
        System.out.println(number.isEligibleVote(16));


//        //ex2-lab 9
//        public static void printSum ( int nr1, int nr2){
//            int result = nr1 + nr2;
//            System.out.println(result);
//        }
//
//
//        //ex3-lab 9
//        public static void printDivide ( int nr1, int nr2){
//            int result = nr1 / nr2;
//            System.out.println(result);
//        }
//
//
//        // ex4a-lab 9
//        public static void ex4a ( int nr1, int nr2, int nr3){
//            int result = -nr1 + nr2 * nr3;
//            System.out.println(result);
//        }
//
//        // ex4b- lab 9
//        public static void ex4b ( int nr1, int nr2, int nr3){
//            int result = (nr1 + nr2) % nr3;
//            System.out.println(result);
//        }
//
//
//        //ex4c-lab 9
//        public static void ex4c ( float nr1, float nr2, float nr3, float nr4){
//            float result = nr1 + (-nr2 * nr3 / nr4);
//            System.out.println(result);
//
//        }
//
//
//        //ex4d-lab 9
//        public static void ex4d ( float nr1, float nr2, float nr3, float nr4, float nr5, float nr6){
//            float result = nr1 + (nr2 / nr3 * nr4) - nr5 % nr6;
//            System.out.println(result);
//        }
//
//
//        // ex2
//        public static long sum ( long primul, long aldoilea){
//            long result = primul + aldoilea;
//            return result;
//        }
//
//
//        //ex2
//        public static long multiply ( long first, long second){
//            long result = first * second;
//            return result;
//        }
//
//
//        //ex2
//        public static int divide ( int impartitor, int deimpartitul){
//            int result = impartitor / deimpartitul;
//            return result;
//        }
//
//
//        //ex3
//        public static void JavaPrint () {
//            System.out.println("      J     a    v     v    a" +
//                    "                 J    a a    v   v    a a" +
//                    "             J   J   aaaaa    v v    aaaaa" +
//                    "              J J   a     a    v    a     a");
//
//
//        }
//
//        //ex4
//        public static float average ( float numere, float cifre, float media){
//            float result = (numere + cifre) / media;
//            return result;
//        }
//
//
//        //ex5
//        public static void ModelPrint () {
//            System.out.println("    + ''''' + " +
//                    "             [ | o   o | ]" +
//                    "               |   ^   |  " +
//                    "               |  '_'  | " +
//                    "               +-------+ ");
//        }
//
//
//        //ex6
//        public static int remainder ( int x, int y){
//            int result = x % y;
//            return result;
//        }
//
//        //ex7
//        public static float fahrenheitToCelsius ( float fahrenheit){
//            float result = 5 / 9 * (fahrenheit - 32);
//            return result;
//
//        }
//
//
//        //ex8
//     //   public static double inchTometers ( double inch){
//            double result = inch / 39.370;
//            return result;
//        }

    }









}









//ex2
public class LogicalOp {


    //ex1
    public void PrintNumbers(int number) {
        for (int w = number; w <= 100; w++) {
            System.out.println(w);
        }


    }

    //ex2
    public void PrintNumbers2(int print) {
        for (int y = print; y >= -100; y--) {
            System.out.println(y);

        }
    }


    //ex3
    public void PrintNumbers3(int first, int second) {

        {
            for (int x = first; x <= second; x++) {
                System.out.println(x);
            }
        }

    }

    //ex4
    public void PrintNumbers4(int first, int second) {

        {
            for (int x = first; x >= second; x--) {
                System.out.println(x);


            }

        }
    }

    //ex5
    public void PrintNumbers5(int even) {
        for (int l = even; l <= 100; l++) {
            if (l % 2 == 0) {
                System.out.println(l);
            }
        }
    }

    //ex6
    public void PrintNumbers6(int odd) {
        for (int m = odd; m <= 100; m++) {
            if (m % 2 == 1) {
                System.out.println(m);
            }
        }

    }

    //ex7
    int sum = 0;

    public void PrintNumbers7(int first, int second) {
        for (int i = first; i <= second; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    //ex8
    public float PrintNumbers8(int first, int second) {

        for (int i = first; i <= second; i++) {
            sum = sum + i;

        }
            return sum/100;

        }
        //ex9
        public String Print( String asterisk){
        for(int y = 0; y <=6; y++){
            for ( int x = 6; x>=y; x--){
                System.out.print("*");
            }
                System.out.println();
            }
            return asterisk;
        }



        }






























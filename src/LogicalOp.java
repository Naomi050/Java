
public class LogicalOp {

//
//    //ex1
//    public void PrintNumbers(int number) {
//        for (int w = number; w <= 100; w++) {
//            System.out.println(w);
//        }
//
//
//    }
//
//    //ex2
//    public void PrintNumbers2(int print) {
//        for (int y = print; y >= -100; y--) {
//            System.out.println(y);
//
//        }
//    }
//
//
//    //ex3
//    public void PrintNumbers3(int first, int second) {
//
//        {
//            for (int x = first; x <= second; x++) {
//                System.out.println(x);
//            }
//        }
//
//    }
//
//    //ex4
//    public void PrintNumbers4(int first, int second) {
//
//        {
//            for (int x = first; x >= second; x--) {
//                System.out.println(x);
//
//
//            }
//
//        }
//    }
//
//    //ex5
//    public void PrintNumbers5(int even) {
//        for (int l = even; l <= 100; l++) {
//            if (l % 2 == 0) {
//                System.out.println(l);
//            }
//        }
//    }
//
//    //ex6
//    public void PrintNumbers6(int odd) {
//        for (int m = odd; m <= 100; m++) {
//            if (m % 2 == 1) {
//                System.out.println(m);
//            }
//        }
//
//    }
//
//    //ex7
//    int sum = 0;
//
//    public void PrintNumbers7(int first, int second) {
//        for (int i = first; i <= second; i++) {
//            sum = sum + i;
//        }
//        System.out.println(sum);
//    }
//
//    //ex8
//    public float PrintNumbers8(int first, int second) {
//
//        for (int i = first; i <= second; i++) {
//            sum = sum + i;
//
//        }
//            return sum/100;
//
//        }
//        //ex9
//        public String Print( String asterisk) {
//            for (int y = 0; y <= 6; y++) {
//                for (int x = 6; x >= y; x--) {
//                    System.out.print("*");
//                }
//                System.out.println();
//            }
//            return asterisk;
//        }

    //Java While Loop
    //ex1
    public void While(int first) {
        while (first <= 100) {
            System.out.println(first);
            first++;
        }
    }

    //ex2
    public void While2(int number) {
        while (number >= -100) {
            System.out.println(number);
            number--;
        }
    }

    //ex3
    public void While3(int first, int second) {
        while (first <= second) {
            System.out.println(first);
            first++;
        }
    }

    int x = 183;
    int y = 114;

    //ex4
    public void While4(int first, int second) {
        if (x < y) {
            while (first <= second) {
                System.out.println(first);
                first++;
            }
        } else if (x > y) {
            while (first >= second) {
                System.out.println(second);
                second++;

            }

        }

    }

    //ex5
    int i = 2;

    public int While5(int even) {
        while (i <= 100) {
            System.out.println(i + even);
            i = i + 2;
        }

        return even;
    }

    //ex6
    int m = 1;

    public int While6(int odd) {
        while (m <= 100) {
            System.out.println(m + odd);
            m = m + 2;
        }
        return odd;
    }

    //ex7
    public float While7(int first, int second) {
        float sum = 0;
        float count = 0;
        while (first <= second) {
            sum = sum + first;
            count++;
            first++;

        }
        return sum / count;

    }

    //ex8
    public int While8(int first, int second) {
        int sum = 0;
        int count = 0;
            while (first <= second) {
                if (first % 7 == 00)
                sum = sum + first;
                count++;
                first++;


            }

        return sum/count;
    }


    //ex9



    }











































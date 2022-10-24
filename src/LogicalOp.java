//ex2
public class LogicalOp {
    public static void main(String[] args) {
        int number = 35;
        chocolateString(number);
        switch (number) {
            case 1:
                System.out.println(chocolateString(35));
        }

        int first = 12;
        isNumberEven(first);

        int vot = 16;
        isEligibleVote(vot);




    }


    //ex3
    public String textcomp(String textInput) {
        if (textInput.equals("FastTrackIT")) {
            return "Learning text comparison";

        } else {
            return "Got to try some more";
        }
    }

    //ex4
    public static int checkBiggerNumber(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }


    }

    //ex5
    public String comparison(String text, int third) {
        if (text.equals("FastTrackIT") && third <= 3) {
            return text + third;
        } else if (!text.equals("FastTrackIT") && third >= 4) {
            return third + text;
        } else {
            return "No condition was met.";
        }
    }

    //ex6
    public String comparison2(int four) {
        if (four > 8 || four == 6) {
            return "The amount of snow this winter was(cm): 7 ";
        } else {
            return "The forecast snow is(cm): 7";
        }


    }

    //ex7
    public String comparison3(int noua) {
        if (noua > 3 && 9 != 4) {
            return "The number is greater than 3 and not equal to 4";
        }
        if (noua == 4) {
            return " The numbers is equal to 4";
        } else if (noua < 3) {
            return "The number is lower than 3";
        } else {
            return "Only the first condition is met.";
        }


    }
   //ex8
    public static int chocolateString(int a) {
        int result = a;
        return result;


    }
    //ex9
    public static String isNumberEven(int b) {
        if (b % 2 == 0) {
            return "is true";

        } else {
            return " is false";
        }

    }
    //ex10
    public static String isEligibleVote(int c){
        if( c > 18){
            return " is true";
        }
        else{
            return " is false";
        }
    }



    }





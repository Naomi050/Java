import java.util.Scanner;

public class MainTryCatch {
    public static void main(String[] args) {

        Read number = new Read();
        System.out.println(number.getNumber());
        System.out.println(number.getNumber2());
        System.out.println(number.getNuber3());
        System.out.println(number.getNumber4());
        int[] myarray = number.getArray(5);
        System.out.println(myarray);
        System.out.println(number.getaList());
        LogicalOp op = new LogicalOp();
        int[] z = {7,8,9,10};
        op.DisaplayArrayInIndex(z, 5);

    }
}

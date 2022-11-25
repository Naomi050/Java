import java.util.Arrays;

public class MainArray {
    public static void main(String[] args) {

        LogicalOp op = new LogicalOp();
        op.getArray();
        System.out.println();

        int arrayEven = 100;
        op.getEvenArray(arrayEven);
        System.out.println();

        int[] array = {4, 6, 7, 8,};
        System.out.println(op.getAverageArray(array));
        System.out.println();

        String[] fructe = new String[] {"mere", "pere", "banane"};
        String cirese = "cirese";
        String mere = "mere";
        System.out.println(op.isInArray(fructe, cirese));
        System.out.println(op.isInArray(fructe, mere));
        System.out.println();

        int[] position = {11, 12, 13, 14,15,};
        int value = 17;
        System.out.println(op.positioninArray(position,value));
        System.out.println();

        op.Lines();
        System.out.println();

        int[] onearray = {100,200,300,400,500};
        int number = 100;
        System.out.println(Arrays.toString(op.DeletetheNumber(onearray, number)));
        System.out.println();

        int[] values = {23, 5, 22, 46};
        System.out.println(op.returntheSecondNumber(values));
        System.out.println();

        int[] numbers = { 30, 31, 32, 33, 34};
        int[] n = {};
        System.out.println(op.MovetheValues(numbers, n));
       }
    }

























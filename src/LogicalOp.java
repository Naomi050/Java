import java.util.List;

public class LogicalOp {
//    //ex 2
    public void getArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
//
//    //ex3
//    public void getEvenArray(int ignoredArrayEven) {
//        int[] arrayEven = new int[100];
//
//        for (int i = 0; i < 100; i++) {
//            arrayEven[i] = i + 1;
//        }
//        for (int i = 0; i < 100; i++) {
//            if (arrayEven[i] % 2 == 0) {
//                System.out.println(arrayEven[i]);
//
//
//            }
//        }
//
//
//    }
//
//    //ex4
//    public float getAverageArray(int[] sumArray) {
//        float sum = 0;
//
//        for (int i = 0; i < sumArray.length; i++) {
//            sum += sumArray[i];
//        }
//        return (sum / sumArray.length);
//
//
//    }
//
//
//    //5
//    public boolean isInArray(String[] values, String value) {
//        for (int i = 0; i < values.length; i++) {
//            if (values[i].equals(value)) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    //6
//    public boolean positioninArray(int[] array, int value) {
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == value) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    //ex7
//    public void Lines() {
//        char[] line = {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-',};
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println(line);
//        }
//    }
//
//    //ex8
//    public int[] DeletetheNumber(int[] array, int number) {
//
//        int[] otherArray = new int[array.length];
//        int j = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == number)
//
//                continue;
//
//            otherArray[j++] = array[i];
//
//        }
//
//        int[] lastoneArray = new int[j];
//
//        for (int i = 0; i < j; i++)
//            lastoneArray[i] = otherArray[i];
//
//        return lastoneArray;
//
//    }
//
//    //ex9
//    public int returntheSecondNumber(int[] array) {
//        int secondnumber = 0;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i + 1; j < 4; j++) {
//                if (array[i] > array[j]) {
//                    secondnumber = array[j];
//                    array[j] = array[i];
//                    array[i] = secondnumber;
//                }
//            }
//        }
//        return array[1];
//    }
//
//    //ex10
//    public int[] MovetheValues(int[] array, int[] array2) {
//        for (int i = 0, x = 0; i < array.length; i++) {
//            array2[x] = array[i];
//            x++;
//
//        }
//        return array2;
//    }

    //ArrayList
    //ex 1
    public void myfruitlist(List<String> fruitlist) {
        for (int i = 0; i < fruitlist.size(); i++) {
            System.out.println(fruitlist.get(i));
        }

    }

    //ex2
    public void NumberAsAParameter(List<Integer> mylist, int nr) {
        mylist.add(nr);

    }
    //ex3
    public void ListofNumbers(List<Integer> Alist, int myArray){
        for(int i = myArray; i<Alist.size();i++){
            System.out.println(Alist.get(i));
        }
    }


    //ex4
    public  void  TheReverseOfTheWords(List<String> animals ){
        for(int i = animals.size()-1;i>=0; i--){
            System.out.println(animals.get(i));
        }

    }
    //ex5
    public void addString(List<String> List, int position, String element){
        List.add(position,element);
    }

    //ex6
    public void ReplaceTheParameter(List<Integer> List, int value){
        List.add(0,value);
    }

    public void PrintToList(List<String> fruitList){
        for(int i = 0; i<fruitList.size(); i++){
            System.out.println("On the index " +i+ " is the element " +fruitList.get(i));
        }
    }

    public int TheBiggestNumber(List<Integer> List){
        int bigNumber = List.get(0);
        for(int i = 0; i<List.size(); i++){
            if(List.get(i)>bigNumber)
                bigNumber=List.get(i);
        }
        return bigNumber;
    }

    //ex5
    public void DisaplayArrayInIndex(int[] anArray, int nr){
        try{
            System.out.println(anArray[nr]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Inside catch, number too large");
        }
    }


    }

































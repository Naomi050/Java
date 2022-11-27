import java.util.ArrayList;

import java.util.List;

public class MainLists {
    public static void main(String[] args) {


        List<String> fruitList = new ArrayList<>();
        fruitList.add("mere ");
        fruitList.add("cirese ");
        fruitList.add("capsuni ");
        fruitList.add("banane ");
        fruitList.add("portocale ");
        fruitList.add("pere ");
        System.out.println();

        LogicalOp logical = new LogicalOp();
        logical.myfruitlist(fruitList);

        List<Integer> number = new ArrayList<>();
        number.add(12);
        number.add(23);
        number.add(78);
        number.add(32);
        number.add(67);
        System.out.println();

       logical.NumberAsAParameter(number, 5);
       logical.ListofNumbers(number, 1);
        System.out.println();

       List<String> aNewList = new ArrayList<>();
       aNewList.add("1-horse");
       aNewList.add("2-rabit");
       aNewList.add("3-hen");
       aNewList.add("4-mouse");
       aNewList.add("5-cat");
       aNewList.add("6-dog");
       logical.TheReverseOfTheWords(aNewList);
        System.out.println();

      logical.addString(aNewList, 2, "cow");
        System.out.println(aNewList);
        System.out.println();

      logical.ReplaceTheParameter(number, 32);
        System.out.println(number);
        System.out.println();

        logical.PrintToList(fruitList);
        System.out.println();

        System.out.println(logical.TheBiggestNumber(number));




    }

}

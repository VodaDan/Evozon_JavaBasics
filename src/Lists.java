import java.util.ArrayList;
import java.util.List;

public class Lists {

    public void listPrint(List list) {
        for(Object x:list) {
            System.out.print(x + ", ");
        }
        System.out.println();
    } // Lists - Ex 1

    public void listAddNumber(ArrayList<Integer> list, int number) {
        list.add(number);
    } // Lists - Ex 2

    public void listPrintFromNumber(ArrayList<Integer> list, int number) {
        for(int i = list.indexOf(number); i < list.size();i++) {
            System.out.println(list.get(i));
        }
    } // Lists - Ex 3

    public void listPrintReverted(ArrayList<Integer> list) {
        for(int i = list.size()-1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    } // Lists - Ex 4

    public void listAddElementAtIndex(ArrayList<String> list, int index, String word) {
        list.add(index,word);
    } // Lists - Ex 5

    public void listAddElementFirstIndex(ArrayList<String> list, String word) {
        list.addFirst(word);
    } // Lists - Ex 6

    public void listPrintListAndIndex(ArrayList<Integer> list) {
        for(int number: list) {
            System.out.println("At index "+list.indexOf(number) + " the elemnt is " + number);
        }
    } // Lists - Ex 7

    public int listReturnMaxNumber(ArrayList<Integer> list) {
        int max = list.get(0);
        for(int number: list) {
            if(number > max) {
                max = number;
            }
        }
        return max;
    } // Lists - Ex 8

}

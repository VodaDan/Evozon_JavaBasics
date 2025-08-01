import java.util.ArrayList;

public class ListOptional {

    public void listSwitchElements (ArrayList<Integer> list, int firstElement, int secondElement) {
        int index = list.indexOf(firstElement);
        int aux = list.get(list.indexOf(secondElement));
        list.set(list.indexOf(secondElement), list.get(list.indexOf(firstElement)));
        list.set(index, aux);
    }

    public ArrayList<Integer> listReturnOnlyEven (ArrayList<Integer> list) {
        ArrayList<Integer> newList = new ArrayList<>();
        for(int x: list) {
            if(x%2==0){
                newList.add(x);
            }
        }
        return newList;
    }
}

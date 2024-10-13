import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        changeFirstAndLast(list);
        System.out.println(list);
    }
    private static void changeFirstAndLast(List<Integer> list){
        int f = list.getFirst();
        int l = list.getLast();
        list.removeLast();
        list.removeFirst();
        list.addFirst(l);
        list.addLast(f);
    }
}
import java.util.ArrayList;
import java.util.Collections;
public class DecReverseList {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(7);

        System.out.println("Orginal List "+list);
        Collections.reverse(list);
        System.out.println("Reverse List "+list);


    }
    
}

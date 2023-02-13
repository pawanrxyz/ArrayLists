import java.util.ArrayList;
import java.util.Collections;;
public class DecendingString {
    public static void main(String args[]) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Welcome");
        list.add("To");
        list.add("Physics");
        list.add("Walah");
        System.out.println("OG "+list);
        Collections.sort(list);
        System.out.println(list);

        Collections.reverseOrder();
        System.out.println(list);

    }

}

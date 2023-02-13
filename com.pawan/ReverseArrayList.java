import java.util.ArrayList;

public class ReverseArrayList {
    static void reverseList(ArrayList<Integer> list) {
        int i = 0, j = list.size() - 1;

        while (i < j) {

            Integer temp = Integer.valueOf(list.get(i));
            list.set(i, list.get(i));
            list.set(j, temp);
            i++;
            j--;
        }

    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println("orginal List");
        System.out.println(list);
        reverseList(list);
        System.out.println("Reverse List " + list);

    }

}

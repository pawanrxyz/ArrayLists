import java.util.ArrayList;
public class ArrayList2 {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);
        System.out.println(list.get(2));
        list.add(10);
        System.out.println(list);
        list.add(1,100);
        System.out.println(list);
        list.set(2,40);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        list.remove(Integer.valueOf(40));
        System.out.println(list);

        list.remove(Integer.valueOf(0));
        System.out.println(list);

        

        // System.out.println(list);
        // for(int i=0;i<list.size();i++) {
        //     System.out.print(list.get(i)+" ");
        // }

    }
    
}

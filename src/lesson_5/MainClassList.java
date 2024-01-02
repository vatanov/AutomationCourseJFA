package lesson_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClassList {
    public static void main(String[] args) {
        List list_1 = new ArrayList();
        System.out.println(list_1);
        list_1.add(11);
        System.out.println(list_1);

        List<String> list_2 = new ArrayList<>();
        System.out.println(list_2);

        list_2.add("Test 2");
        list_2.add("");
        list_2.add("Test 4");
        list_2.add("Test 5");
        System.out.println(list_2);

        System.out.println("Element 1 = " + list_2.get(0));

        list_2.add(0, "New Test 0");
        System.out.println(list_2);

        list_2.set(2, "Test 33");
        System.out.println(list_2);
        list_2.set(2, list_2.get(2) + " 44");
        System.out.println(list_2);

        // Exceptions:
        //list_2.get(10);
        //list_2.get(-1);

        list_2.remove(1);
        System.out.println(list_2);

        System.out.println("-------------");

        for (int i = 0; i < list_2.size(); i++) {
            System.out.println((i+1) + ". " + list_2.get(i));
        }

        for (String element: list_2) {
            System.out.println(element);
        }

        System.out.println("--------------");
        ArrayList<Integer> list_3 = new ArrayList<>();
        list_3.add(22);
        list_3.add(11);
        list_3.add(44);
        list_3.add(77);
        list_3.add(33);
        System.out.println(list_3);
        System.out.println(Collections.min(list_3));
        Collections.sort(list_3);
        System.out.println(list_3);
        Collections.reverse(list_3);
        System.out.println(list_3);


    }
}

package lesson_5_hw;

import java.util.ArrayList;

public class MyList {
    public static ArrayList<Integer> reverse(ArrayList<Integer> list) {
        int counter = list.size();
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = list.size()-1; i >= 0; i--) {
            newList.add(list.get(i));
        }
        return newList;
    }

    public static int min(ArrayList<Integer> list) {
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        return min;
    }

    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(5);
        l.add(90);
        l.add(31);
        l.add(100);
        l.add(78);

        System.out.println(l);
        ArrayList<Integer> reversed_list = reverse(l);
        System.out.println(reversed_list);
        System.out.println(min(l));
    }
}

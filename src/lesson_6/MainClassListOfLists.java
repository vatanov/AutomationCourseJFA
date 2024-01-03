package lesson_6;

import java.util.ArrayList;
import java.util.List;

public class MainClassListOfLists {
    public static void main(String[] args) {
        List<List<String>> listList = new ArrayList<>();
        listList.add(new ArrayList<>());
        System.out.println(listList);
        listList.get(0).add("Test00");
        listList.add(new ArrayList<>());
        listList.get(1).add("Test10");
        listList.get(0).add("Test01");
        System.out.println(listList);
        listList.add(0, new ArrayList<>());
        System.out.println(listList);
        listList.get(0).add("Test");
        System.out.println(listList);
        System.out.println(listList.get(1));
        System.out.println(listList.get(1).get(0));
        listList.get(1).add(1, "TestNew");
        System.out.println(listList);
        listList.get(1).set(1, "NEW");
        System.out.println(listList);
        listList.add(new ArrayList<>());
        listList.add(new ArrayList<>());
        listList.get(4).add("Test04");
        System.out.println(listList);
        listList.remove(2);
        System.out.println(listList);
        listList.get(1).remove(0);
        System.out.println(listList);

        List<String> addList = new ArrayList<>();
        addList.add("Value 1");
        addList.add("Value 2");
        System.out.println(addList);

        listList.add(addList);
        System.out.println(listList);

        addList.add("Value 3");
        System.out.println(addList);
        System.out.println(listList);
        listList.add(addList);
        System.out.println(listList);

        List<String> addList2 = new ArrayList<>();
        addList2.add("111");
        addList2.add("222");
        System.out.println(addList2);

        listList.add(new ArrayList<>());
        listList.get(6).addAll(addList2);
        System.out.println(listList);
        addList2.add("333");
        System.out.println(listList);
        System.out.println(addList2);

        System.out.println("----------");

        for (List<String> row: listList) {
            System.out.println(row);
        }
    }
}

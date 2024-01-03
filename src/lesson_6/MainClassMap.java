package lesson_6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainClassMap {
    public static void main(String[] args) {
        HashMap<String, String> ourMap = new HashMap<>();
        ourMap.put("login", "test");
        ourMap.put("pass", "123");
        System.out.println(ourMap);
        ourMap.put("pass1", "235");
        System.out.println(ourMap);
        System.out.println(ourMap.size());
        System.out.println(ourMap.get("pass"));
        ourMap.put("pass", "999");
        System.out.println(ourMap);
        ourMap.remove("pass1");
        System.out.println(ourMap);

        ArrayList<HashMap<String, String>> listMap = new ArrayList<>();
        listMap.add(new HashMap<>());
        listMap.get(0).put("login", "test1");
        listMap.get(0).put("pass", "123");
        listMap.get(0).put("pass1", "235");
        System.out.println(listMap);
        listMap.add(new HashMap<>());
        listMap.get(1).put("login", "test2");
        listMap.get(1).put("pass", "456");
        listMap.get(1).put("pass1", "987");
        System.out.println(listMap);
        listMap.add(ourMap);
        System.out.println(listMap);
        System.out.println(listMap.get(1).get("login"));

        String login = "test1";
        for (HashMap row: listMap) {
            if (row.get("login").equals(login)) {
                System.out.println(row.get("pass"));
            }
        }
    }
}

package lesson_4_hw2;

public class MainStrings {
    public static void main(String[] args) {
        // 1. Практика методов класса String
        // Распечатать последний символ строки. Используем метод String.charAt().
        String s1 = "I like Java!";
        System.out.println(s1.charAt(s1.length()-1)); //!

        // Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
        String s2 = new String("I like Java!!!");
        System.out.println(s2.endsWith("!!!")); // true

        // Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
        System.out.println(s2.startsWith("I like")); // true

        // Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
        System.out.println(s2.contains("likes")); // false

        // Найти позицию подстроки “Java” в строке “I like Java!!!”.
        System.out.println(s2.indexOf("Java")); // 7

        // Заменить все символы “а” на “о”.
        String s3 = s2.replace("a", "o");
        System.out.println(s3); // I like Jovo!!!

        // Преобразуйте строку к верхнему регистру.
        System.out.println(s2.toUpperCase()); // I LIKE JAVA!!!

        // Преобразуйте строку к нижнему регистру.
        System.out.println(s2.toLowerCase()); // i like java!!!

        // Вырезать строку Java c помощью метода String.substring().
        String s4 = s2.substring(3, 8);
        System.out.println(s4); // ike J
    }

    // Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
    public static String getString(String s) {
        return s;
    }
}

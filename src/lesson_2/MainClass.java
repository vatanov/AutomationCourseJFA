package lesson_2;

public class MainClass {
    public static void main(String[] args) {
        /*
        int rez_1 = sumDoubled (int,int);
        String rez_2 = sumDoubled (String,String);
        int rez_3 = sumDoubled (String,int);

        ДЗ:
        1. Створити окремий package Lesson 2 Homework
        2. В ньому створити новий калькулятор, який має:
            а) множити інти
            б) віднімати інти
            в) ділення інтів
            г) ділення даблів
        */

        SimpleCalc calc = new SimpleCalc();
        int rez_1 = calc.sumDoubled(4, 5);
        String rez_2 = calc.sumDoubled ("qaz","wsx");
        String rez_11 = calc.sumDoubled (56,"wsx");
        int rez_3 = calc.sumDoubled("78", 10);
        int rez_33 = calc.sumDoubled("7hhh8", 10);
        System.out.println(rez_33);
        System.out.println("---- The end ----");
    }
}

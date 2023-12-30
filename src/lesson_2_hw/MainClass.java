package lesson_2_hw;

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

        Calculate calculate = new Calculate();
        int res01 = calculate.divide(75, 3);
        int res02 = calculate.divide(75, 0);
        System.out.println(res02);
    }
}

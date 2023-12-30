package lesson_2_hw;

public class Calculate {
    public int minus(int a, int b) {
        int result = a - b;
        System.out.println("Int: " + a + " - " + b + " = " + result);
        return result;
    }

    public int multiple(int a, int b) {
        int result = a * b;
        System.out.println("Int: " + a + " * " + b + " = " + result);
        return result;
    }

    public int divide(int a, int b) {
        try {
            int result = a / b;
            System.out.println("Int: " + a + " / " + b + " = " + result);
            return result;
        } catch (ArithmeticException e) {
            System.out.println("ERROR: " + e);
            return 111;
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
            return 222;
        } finally {
            System.out.println("This is finally");
        }
    }
}

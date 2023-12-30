package lesson_2;

public class SimpleCalc {
    public int sumDoubled(int numA, int numB) {
        int result = (numA + numB) * 2;
        System.out.println("int: Result doubled: (" + numA + " + " + numB + ") * 2 = " + result);
        return result;
    }

    public String sumDoubled(String strA, String strB) {
        String result = strA + strB + strA + strB;
        System.out.println("String: Result doubled: " + strA + " + " + strB + " = " + result);
        return result;
    }

    public String sumDoubled(int numA, String strB) {
        String result = numA + strB + numA + strB;
        System.out.println("int + String: Result doubled: " + numA + " + " + strB + " = " + result);
        return result;
    }

    public int sumDoubled(String strA, int numB) {
        try {
            int result = (Integer.parseInt(strA) + numB) * 2;
            System.out.println("int: Result doubled: (" + strA + " + " + numB + ") * 2 = " + result);
            return result;
        } catch (NumberFormatException e) {
            System.out.println("ERROR: " + e);
            return 888;
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
            return 999;
        } finally {
            System.out.println("Block finally");
        }
    }
}

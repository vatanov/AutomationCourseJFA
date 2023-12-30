package lesson_4;

public class MainClassString {
    public static void main(String[] args) {
        String testString = "Test String. ";
        String testString2 = new String("Test String. "); // буде створений новий екземпляр класу String
        String testString3 = "Test String. "; // не буде створений новий екземпляр, а Java запише такий саме лінк на адресу, як і у testString

        System.out.println(testString);
        System.out.println(testString3);
        testString = "test"; // в змінну буде записано новий лінк на новий обʼєкт
        System.out.println(testString);
        System.out.println(testString3); // але старий лінк на старий обʼєкт так і лишиться в змінній testString3
        System.out.println("---------");

        System.out.println(testString3.toUpperCase());
        System.out.println(testString3.toLowerCase());
        System.out.println(testString3);

        String str1 = "test";
        String str2 = new String("test");

        // порівняння строк відбувається не по значееню, а по лінкам, тому str1 і str2 будуть не рівними, бо
        // лінки не однакові в такому випадку
        if (str1 == str2) {
            System.out.println(str1 + " Equals " + str2);
        } else {
            System.out.println(str1 + " NOT Equals " + str2);
        }

        if (str1.equals(str2)) {
            System.out.println(str1 + " Equals " + str2);
        } else {
            System.out.println(str1 + " NOT Equals " + str2);
        }

        boolean eq = "Test".equals("test"); // false
        System.out.println(eq);
        "Test".equalsIgnoreCase("test"); //true
        "Test" .toLowerCase().equals("test".toLowerCase());//true

        String ourString = "   Test Text.   ".trim(); // обрізає лишні пробіли на початку та в кінці. Получиться: Test Text.
        System.out.println(ourString);
        String[] words = ourString.split(" "); // розбиває строку на слова (ми вказуємо розділювач - пробіл) та повертає масив слів
        System.out.println("Number of words " + words.length);

        // Запис в одну строку:
        System.out.println(" Test test   ".trim().split(" "). length);
        System.out.println("   Test  Text   ".replace(" ", ";")); // Получиться ;;;Test;;Text;;; (можна замінювати на пустоту - "")

        // Символ екранування:
        String str3 = "test,,test1\", test2 ";
        String[] fromStr3 = str3.trim().replace(" ", "").replace("\"", "").split(",");

        for (int i = 0; i < fromStr3.length; i++) {
            if (fromStr3[i].length() > 0 ) {
                System.out.println(fromStr3[i]);
            }
        }
    }
}

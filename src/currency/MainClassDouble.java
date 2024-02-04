package currency;

import org.apache.log4j.Logger;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MainClassDouble {
    public static void main(String[] args) {

        // Округлення дробних чисел
        Double var = 415.145;
        System.out.println(var);
        BigDecimal bigDecimal = BigDecimal.valueOf(var);
        System.out.println(bigDecimal.setScale(2, RoundingMode.valueOf(4))); // 415.15
        System.out.println(bigDecimal.setScale(2, RoundingMode.valueOf(5))); // 415.14

        // Зовнішні бібліотеки
        // Як підключати:
        // 1. jar
        // 2. properties
        // 3. Class (optional)

        Logger logger = Logger.getLogger("MainClassDouble");
        logger.info("Info");
        logger.debug("Debug");
        logger.error("Error");
    }
}

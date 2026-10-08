import java.util.logging.Level;
import java.util.logging.Logger;

public class Calculator {

    private static final Logger LOGGER = Logger.getLogger(Calculator.class.getName());

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        LOGGER.log(Level.INFO, "Addition: {0}", a + b);
        LOGGER.log(Level.INFO, "Subtraction: {0}", a - b);
        LOGGER.log(Level.INFO, "Multiplication: {0}", a * b);
        LOGGER.log(Level.INFO, "Division: {0}", a / b);
    }
}
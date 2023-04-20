import java.math.BigDecimal;
import java.math.RoundingMode;

public class CurrencyConverter {

    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    public BigDecimal convert(BigDecimal originalAmount, BigDecimal conversionRate) {
        return originalAmount.multiply(conversionRate).setScale(2, RoundingMode.HALF_UP);
    }

    public boolean isValidRate(BigDecimal conversionRate) {
        // TODO Add code to make the tests pass
        return false;
    }

}

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class CurrencyConverter {

    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    public BigDecimal convert(BigDecimal originalAmount, BigDecimal conversionRate) {
        return originalAmount.multiply(conversionRate).setScale(2, RoundingMode.HALF_UP);
    }

    public boolean isValidRate(BigDecimal conversionRate) {
        BigDecimal min = new BigDecimal("0");
        BigDecimal max = new BigDecimal("100000");
        if(conversionRate.compareTo(min)== 1 && conversionRate.compareTo(max) == -1) {
            return true;
        }else {
            return false;
        }
    }

}

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CurrencyConverterTest {

    @BeforeEach
    void setUp() throws Exception {
    }

    @Test
    void testConvert() {
        CurrencyConverter converter = new CurrencyConverter();
        BigDecimal originalAmount = BigDecimal.valueOf(100.00);
        BigDecimal conversionRate = BigDecimal.valueOf(2.70);
        BigDecimal expectedResult = BigDecimal.valueOf(270.00).setScale(2);
        
        BigDecimal actualResult = converter.convert(originalAmount, conversionRate);
        assertEquals(expectedResult, actualResult);
    }
    
    @Test
    void testConvertWithRounding() {
        CurrencyConverter converter = new CurrencyConverter();
        BigDecimal originalAmount = BigDecimal.valueOf(99.99);
        BigDecimal conversionRate = BigDecimal.valueOf(2.70);
        BigDecimal expectedResult = BigDecimal.valueOf(269.97).setScale(2);
        
        BigDecimal actualResult = converter.convert(originalAmount, conversionRate);
        assertEquals(expectedResult, actualResult);
    }    
    
    @Test
    void testIsValidRateWhenOverMax() {
        CurrencyConverter converter = new CurrencyConverter();
        BigDecimal conversionRate = BigDecimal.valueOf(200000.00);
        assertFalse(converter.isValidRate(conversionRate));
    }
    
    @Test
    void testIsValidRateWhenWithinRange() {
        CurrencyConverter converter = new CurrencyConverter();
        BigDecimal conversionRate = BigDecimal.valueOf(999.00);
        assertTrue(converter.isValidRate(conversionRate));
    }
    
    //TODO add more tests to cover partitions discussed in class for HW5

}

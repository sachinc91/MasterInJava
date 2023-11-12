//import org.testng.Assert;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class CurrencyTest {

//    @Test
//    @DataProvider(name = "currencies1")
//    void testCurrencyFormat(String currencyCode,
//            Locale locale,
//            BigDecimal value,
//            String expectedResult) {
//
//        // ARRANGE
//        var format = NumberFormat.getCurrencyInstance(locale);
//        var currency = Currency.getInstance(currencyCode);
//        format.setCurrency(currency);
//
//        // ACT
//        String result = format.format(value);
//
//        // ASSERT
//        Assert.assertEquals(result, expectedResult);
//    }
//
//    @DataProvider(name = "currencies1")
//    Iterator<Object[]> provideTestData() {
//        var value = new BigDecimal("1234.99");
//        var locale = Locale.GERMAN;
//        return List.of(new Object[] { "EUR", locale, value, "€ 1.234,99" },
//                        new Object[] { "CHF", locale, value, "CHF 1.234,99" },
//                        new Object[] { "USD", locale, value, "$ 1.234,99" },
//                        new Object[] { "JPY", locale, value, "¥ 1.234,99" })
//                .iterator();
//    }
}

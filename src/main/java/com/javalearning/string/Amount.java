package com.javalearning.string;

import java.util.Currency;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Amount {

    // print currency character present in text using regular expression
    public String getCurrencySymbol(String[] text) {
        Pattern MY_PATTERN = Pattern.compile("\\p{Sc}");
        String amount = "";
        for (String str : text) {
            amount = str;
            Matcher m = MY_PATTERN.matcher(str);
            while (m.find()) {
                amount = m.group();
            }
            System.out.printf("Amount: %s%n", amount);
        }
        return amount;
    }
    public Set<Currency> getAllCurrencies() {
        Set<Currency> currencies = Currency.getAvailableCurrencies();
        return currencies;
    }

    public static void main(String[] args) {
//        String[] text = {"US$1,234.46", "$1,234.46", "USD1,234.46",""};
        Amount amount = new Amount();
//        amount.getCurrencySymbol(text);
        amount.getAllCurrencies().stream().map(k -> k.getSymbol()).forEach(System.out::println);
        // print Locale.getAvailableLocales()
        Locale[] locales = Locale.getAvailableLocales();
    }


}

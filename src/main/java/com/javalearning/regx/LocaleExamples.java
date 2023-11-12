package com.javalearning.regx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LocaleExamples {

    /***
     * US$, $, US$ ,US,
     *
     * # temporary store currency :
     * if currency symbol only present in array then return
     * ELSE US$ remove alphbets return currency
     * else US
     */
/*
    public static void main(String[] args) {
        // ASSERT
        // CAD , GBP, USD
        String []arr = { "UK","US"};
        //System.out.println(getCurrencySymbool(currencyCode,arr));

    }
*/

    public String getCurrencySymbool(String[] arr) {
        String currSymbol = null;
        String symbol = "";

        for (int i = 0; i < arr.length; i++) {
            symbol = arr[i];
            String regex = "\\p{Sc}";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(symbol);
            while (matcher.find()) {
                currSymbol = matcher.group();
            }
            if (currSymbol != null) {
                return currSymbol;
            }
            else return symbol;
        }
     return "";
    }







}

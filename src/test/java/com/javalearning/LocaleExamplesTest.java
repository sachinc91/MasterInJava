package com.javalearning;

import com.javalearning.regx.LocaleExamples;

import org.junit.Assert;
import org.junit.Test;

public class LocaleExamplesTest {

    LocaleExamples localeExamples = new LocaleExamples();

    @Test
    public void nullOrEmptyParamsWithGetCurrencySymbol(){
        String []arr = {};
        String currencySymbol = localeExamples.getCurrencySymbool(arr);
        Assert.assertEquals("",currencySymbol);
    }

    @Test
    public void getCurrencySymbol(){
        String []arr = { "$","US$","US"};
        String currencySymbol = localeExamples.getCurrencySymbool(arr);
        Assert.assertEquals("$",currencySymbol);
    }

    @Test
    public void getCurrencySymbolV1(){
        String []arr = { "US"};
        String currencySymbol = localeExamples.getCurrencySymbool(arr);
        Assert.assertEquals("US",currencySymbol);
    }

    @Test
    public void getCurrencySymbolV2(){
        String []arr = { "US"};
        String currencySymbol = localeExamples.getCurrencySymbool(arr);
        Assert.assertEquals("US",currencySymbol);
    }
}

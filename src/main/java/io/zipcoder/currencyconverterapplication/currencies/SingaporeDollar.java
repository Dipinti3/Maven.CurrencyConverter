package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class SingaporeDollar implements ConvertableCurrency {
    @Override
    public Double convert(CurrencyType currencyType) {
        Double result=currencyType.getRate()/CurrencyType.SINGAPORE_DOLLAR.getRate();
        return result;
    }
}

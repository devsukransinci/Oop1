package org.example.Entities;

public interface  IBankService {
    default double convertRate(CurrencyRate currencyRate) {
        return 0;
    }
}

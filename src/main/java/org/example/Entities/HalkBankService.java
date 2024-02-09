package org.example.Entities;

public class HalkBankService implements IBankService {
    public double convertCurrency(CurrencyRate currencyRate) {
        return currencyRate.getPrice() / 30.54;
    }
}

package org.example.Entities;

public class FakeBankServices implements IBankService {
    public double convertRate(CurrencyRate currencyRate) {
        return currencyRate.getPrice() / 30.60;
    }
}

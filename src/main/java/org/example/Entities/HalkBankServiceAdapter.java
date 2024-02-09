package org.example.Entities;

public class HalkBankServiceAdapter implements IBankService {
    public double convertRate(CurrencyRate currencyRate) {
        HalkBankService halkBankService = new HalkBankService();
        return halkBankService.convertCurrency(currencyRate);
    }

}

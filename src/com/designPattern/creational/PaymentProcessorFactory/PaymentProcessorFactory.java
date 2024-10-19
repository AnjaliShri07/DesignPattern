package com.designPattern.creational.PaymentProcessorFactory;

import java.util.*;
import java.util.function.Supplier;

public class PaymentProcessorFactory {
    private static final Map<String, Supplier<PaymentProcessor>> processorMap = new HashMap<>();

    // Static block to initialize the map
    static {
        processorMap.put("creditcard", CreditCardProcessor::new);
        processorMap.put("paypal", PayPalProcessor::new);
        processorMap.put("banktransfer", BankTransferProcessor::new);
        processorMap.put("crypto", CryptoProcessor::new);
    }

    public PaymentProcessor getPaymentProcessor(String type) {
        Supplier<PaymentProcessor> processorSupplier = processorMap.get(type.toLowerCase());
        if(processorSupplier != null){
            return processorSupplier.get();
        }else {
            throw new IllegalArgumentException("Unknown Payment type");
        }
    }

}

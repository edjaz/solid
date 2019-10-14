package com.example.demo.isp.wrong;

public class FirstPricePrinter extends Printer implements IPrinter {

    public FirstPricePrinter(String name) {
        super(name);
    }

    @Override
    public String printPage() {
        return name + ": print";
    }

    @Override
    public String scanPage() {
        return name + ": Fonctionnalité absente";
    }

    @Override
    public String faxPage() {
        return name + ": Fonctionnalité absente";
    }
}

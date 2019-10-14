package com.example.demo.isp.wrong;

public class AllInOnePrinter extends Printer implements IPrinter {
    public AllInOnePrinter(String name) {
        super(name);
    }

    @Override
    public String printPage() {
        return name + ": print";
    }

    @Override
    public String scanPage() {
        return name + ": scan";
    }

    @Override
    public String faxPage() {
        return name + ": fax";
    }
}

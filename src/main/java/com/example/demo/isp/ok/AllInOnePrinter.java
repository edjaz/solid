package com.example.demo.isp.ok;

public class AllInOnePrinter extends Printer implements Faxable, Printable, Scanable {
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

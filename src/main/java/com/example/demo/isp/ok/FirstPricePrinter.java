package com.example.demo.isp.ok;

public class FirstPricePrinter extends Printer implements Printable{

    public FirstPricePrinter(String name) {
        super(name);
    }

    @Override
    public String printPage() {
        return name + ": print";
    }

}

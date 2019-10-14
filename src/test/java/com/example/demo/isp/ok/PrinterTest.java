package com.example.demo.isp.ok;

import org.assertj.core.api.Assertions;
import org.junit.Test;


public class PrinterTest {


    @Test
    public void allinone() {
        AllInOnePrinter printer = new AllInOnePrinter("allinone");

        Assertions.assertThat(printer.printPage()).isEqualTo("allinone: print");
        Assertions.assertThat(printer.scanPage()).isEqualTo("allinone: scan");
        Assertions.assertThat(printer.faxPage()).isEqualTo("allinone: fax");
    }


    @Test
    public void firstPrice() {
        FirstPricePrinter printer = new FirstPricePrinter("firstPrice");

        Assertions.assertThat(printer.printPage()).isEqualTo("firstPrice: print");

    }

}
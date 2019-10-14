package com.example.demo.lsp.bad;

import org.assertj.core.api.Assertions;
import org.junit.Test;


public class MonkeyTest {

    @Test
    public void beark() {
        Monkey monkey = new Monkey("Kiki");
        Fruit orange = new Orange();
        Assertions.assertThat( monkey.eat(orange)).isEqualTo("Break !!!");
    }

    @Test
    public void ieatBanana() {
        Monkey monkey = new Monkey("Kiki");
        Fruit banana = new Banana();
        Assertions.assertThat( monkey.eat(banana)).isEqualTo("je mange banana" );
    }


    @Test
    public void ieatApple() {
        Monkey monkey = new Monkey("Kiki");
        Fruit apple = new Apple();
        Assertions.assertThat( monkey.eat(apple)).isEqualTo("je mange apple" );
    }
}
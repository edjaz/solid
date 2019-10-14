package com.example.demo.lsp.ok;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class BananaTest {
    @Test
    public void beark() {
        Monkey monkey = new Monkey("Kiki");
        Orange orange = new Orange();
        Assertions.assertThat(monkey.eat(orange)).isEqualTo("Break !!!");
    }

    @Test
    public void ieatBanana() {
        Monkey monkey = new Monkey("Kiki");
        Banana banana = new Banana();
        Assertions.assertThat(monkey.eat(banana)).isEqualTo("je mange banana");
    }


    @Test
    public void ieatApple() {
        Monkey monkey = new Monkey("Kiki");
        Apple apple = new Apple();
        Assertions.assertThat(monkey.eat(apple)).isEqualTo("je mange apple");
    }
}
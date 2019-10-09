package com.example.demo.ocp;

import com.example.demo.ocp.ok.*;
import org.assertj.core.api.Assertions;
import org.junit.Test;


public class SquareOkTest {

    @Test
    public void shoud_be_a_triangle() {
        Forme triangle = new Triangle(new Point("E"), new Point("F"), new Point("G"));
        Assertions.assertThat(triangle.getType()).isEqualTo("triangle");
    }

    @Test
    public void shoud_be_a_carre() {
        Forme carre = new Carre(new Point("A"), new Point("B"), new Point("C"), new Point("D"));
        Assertions.assertThat(carre.getType()).isEqualTo("carré");
    }

}


package com.example.demo.ocp;

import com.example.demo.ocp.bad.Point;
import com.example.demo.ocp.bad.Square;
import org.assertj.core.api.Assertions;
import org.junit.Test;


public class SquareBadTest {

    @Test
    public void shoud_be_a_triangle() {
        Square triangle = new Square(new Point("E"), new Point("F"), new Point("G"));
        Assertions.assertThat(triangle.getType()).isEqualTo("triangle");
    }

    @Test
    public void shoud_be_a_carre() {
        Square carre = new Square(new Point("A"), new Point("B"), new Point("C"), new Point("D"));
        Assertions.assertThat(carre.getType()).isEqualTo("carré");
    }

}


package org.polina;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        GeomFigure c = new Cube(new BigDecimal("5.3"));

        List<GeomFigure> fs = new ArrayList<>();
        fs.add(c);
        fs.add(new Parallelogram(new BigDecimal("5"), new BigDecimal("3")));
        fs.forEach(figure -> {
            System.out.println("Volume of figure " + figure.getClass().getSimpleName() + " equals to " + figure.getVolume());
            if (figure instanceof WoodFigures) {
                System.out.println("This figure is made of wood");
            }
        });
    }
}

package org.polina;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Parallelogram implements SpecificInterface, WoodFigures {

    private BigDecimal length;
    private BigDecimal width;

    public Parallelogram(BigDecimal length, BigDecimal width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public BigDecimal getVolume() {
        return length.multiply(width).setScale(2, RoundingMode.HALF_UP);
    }

    @Override
    public int getSurfacesCount() {
        return 6;
    }
}

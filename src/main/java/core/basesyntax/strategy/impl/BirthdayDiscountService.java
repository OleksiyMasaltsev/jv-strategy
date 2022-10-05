package core.basesyntax.strategy.impl;

import core.basesyntax.strategy.DiscountService;

public class BirthdayDiscountService implements DiscountService {
    public static final double DISCOUNT = 33.0d;

    @Override
    public double getDiscount() {
        return DISCOUNT;
    }
}

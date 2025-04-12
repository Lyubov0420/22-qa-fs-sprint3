package ru.yandex.praktikum.model;

import ru.yandex.praktikum.model.constants.Colour;
import ru.yandex.praktikum.model.constants.Discount;

public class Apple extends Food {
    private final String colour;


    public Apple(int amount, double price, String colour) {
        super(true, price, amount);
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        return Colour.RED.equals(colour) ? Discount.RED_APPLE : Discount.NONE;
    }

    public String getColour() {
        return colour;
    }
}
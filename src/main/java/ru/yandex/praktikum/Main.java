package ru.yandex.praktikum;

import ru.yandex.praktikum.model.Apple;
import ru.yandex.praktikum.model.Food;
import ru.yandex.praktikum.model.Meat;
import ru.yandex.praktikum.model.constants.Colour;
import ru.yandex.praktikum.service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5,100);
        Apple redApple = new Apple(10,50, Colour.RED);
        Apple greenApple = new Apple(8,60, Colour.GREEN);

        Food[] items = new Food[] {meat, redApple, greenApple};
        ShoppingCart cart = new ShoppingCart(items);

System.out.println(" Сумма всех продуктов без скидки: " + cart.getTotalAmountWithoutDiscount());
System.out.println("Общая сумма товаров со скидкой: " + cart.getTotalPriceWithDiscount());
System.out.println("Сумма вегетарианских продуктов без скидки: " + cart.getVegetarianTotalWithoutDiscount());

    }
}
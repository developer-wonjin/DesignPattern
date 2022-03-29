package stategyPattern.strategy;

import stategyPattern.Item;

public class GeneralDiscountStrategy implements DiscountStrategy {
    @Override
    public int getDiscountPrice(Item item) {
        return item.getPrice();
    }
}
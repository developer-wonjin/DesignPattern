package stategyPattern.strategy;

import stategyPattern.Item;

public interface DiscountStrategy {
    int getDiscountPrice(Item item);
}
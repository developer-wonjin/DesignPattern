package stategyPattern;

import stategyPattern.strategy.DiscountStrategy;

import java.util.List;

public class CalculatorWithStrategy {

    private DiscountStrategy discountStrategy;

    public int calculate(List<Item> items){
        int sum = 0;
        int discountedPrice = 0;

        for(Item item : items){
            discountedPrice = discountStrategy.getDiscountPrice(item);

            sum += discountedPrice;

            System.out.println(String.format("%s: %d\n", item.getName(), discountedPrice));

//            if(firstGuest)
//                sum += (int)(item.getPrice() * 0.9);
//            else if(! item.isFresh())
//                sum += (int)(item.getPrice() * 0.9);
//            else
//                sum += item.getPrice();
        }

        return sum;
    }

    public CalculatorWithStrategy(DiscountStrategy discountStrategy){
        this.discountStrategy = discountStrategy;
    }
}

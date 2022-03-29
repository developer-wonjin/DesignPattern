package stategyPattern;

import java.util.List;

public class Calculator {



    public int calculate(boolean firstGuest, List<Item> items){
        int sum = 0;
        int discountedPrice = 0;

        for(Item item : items){
            if(firstGuest){
                discountedPrice = (int)(item.getPrice() * 0.9);
            }else if(! item.isFresh()){
                discountedPrice = (int)(item.getPrice() * 0.5);
            }else{
                discountedPrice = item.getPrice();
            }

            sum += discountedPrice;
            System.out.println(String.format("%s: %d\n", item.getName(), discountedPrice));
        }

        return sum;
    }
}
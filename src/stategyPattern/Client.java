package stategyPattern;

import stategyPattern.strategy.DiscountStrategy;
import stategyPattern.strategy.FirstGuestDiscountStrategy;
import stategyPattern.strategy.FreshDiscountStrategy;
import stategyPattern.strategy.GeneralDiscountStrategy;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        List<Item> items = new ArrayList<>();
        items.add(new Item("사과", 1000, Year.of(2022).atMonth(3).atDay(24).atTime(13, 50)));
        items.add(new Item("바나나", 1000, Year.of(2022).atMonth(3).atDay(24).atTime(5, 55)));
        items.add(new Item("신선하지 않은 귤", 1000, Year.of(2022).atMonth(3).atDay(24).atTime(5, 6)));

        int total = 0;

        //일반계산기
        Calculator calculator = new Calculator();
//         total = calculator.calculate(false, items);

        //전략패턴계산기
//        DiscountStrategy strategy = new FirstGuestDiscountStrategy();



        DiscountStrategy strategy = new FreshDiscountStrategy();
//        DiscountStrategy strategy = new GeneralDiscountStrategy();

        CalculatorWithStrategy calculatorWithStrategy = new CalculatorWithStrategy(strategy);
        total = calculatorWithStrategy.calculate(items);
        System.out.println("total: " + total);
    }
}

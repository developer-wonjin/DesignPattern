package stategyPattern;

import java.time.LocalDateTime;

public class Item {
    private String name;
    private int price;
    private LocalDateTime receivingTime;

    public Item(String name, int price, LocalDateTime receivingTime) {
        this.name = name;
        this.price = price;
        this.receivingTime = receivingTime;

    }

    public String getName(){
        return name;
    }

    public int getPrice() {
        return price;

    }

    public boolean isFresh() {
        System.out.println("수령시간으로 부터 6시간 지난 시각: " + receivingTime.plusHours(6));
        System.out.println("LocalDateTime.now():         " + LocalDateTime.now());

        boolean ret = receivingTime.plusHours(6).isBefore(LocalDateTime.now());
        System.out.println("ret: " + ret);
        return ret;    // 입고 6시간 이전까지만 신선한 상품으로 간주

    }

}

import models.Item;
import models.Order;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Item item1 = new Item(1, 10, "Pen");
        Item item2 = new Item(2, 5, "Pencil");
        Item item3 = new Item(3, 30, "Set of pens");

        List<Item> orderList = new ArrayList<>();
        orderList.add(item1);
        orderList.add(item2);

        Order myOrder = new Order(1, orderList);
        myOrder.getOrderDetails();
    }
}
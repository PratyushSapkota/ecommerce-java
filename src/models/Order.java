package models;


import java.util.ArrayList;
import java.util.List;

public class Order {
    int orderId;
    List<Item> items = new ArrayList<Item>();
    public Order(int orderId, List<Item> items) {
        this.orderId = orderId;
        this.items = items;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }


    public void getOrderDetails(){
        float totalPrice = 0;

        for(int i = 0; i < items.size(); i++){
            System.out.println("Item " + (i + 1));
            System.out.println(items.get(i).getName());
            System.out.println( "Rs " +  (items.get(i).getPrice()));
            System.out.println("_____________");
            totalPrice = totalPrice + items.get(i).getPrice();
        }



        System.out.println("Total price is: Rs " + totalPrice);
    }
}

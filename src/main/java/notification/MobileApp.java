package notification;

import order.Order;

public class MobileApp {
    public void updateOrderStatus(Order order){
        System.out.println("Aplikacja Mobilna = Zamowinie numer: " + order.getOrderNumber() + " zmieniło status na: " + order.getOrderStatus());
    }
}

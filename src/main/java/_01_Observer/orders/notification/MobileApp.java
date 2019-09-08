package _01_Observer.orders.notification;

import _01_Observer.orders.order.Order;

public class MobileApp implements Observer {
    public void update(Order order){
        System.out.println("Aplikacja Mobilna = Zamowinie numer: " + order.getOrderNumber() + " zmieniło status na: " + order.getOrderStatus());
    }
}

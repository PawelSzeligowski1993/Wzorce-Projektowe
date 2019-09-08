package behavioralPatterns._01_Observer.orders.notification;

import behavioralPatterns._01_Observer.orders.order.Order;

public class Email implements Observer{
    public void update(Order order){
        System.out.println("Email = Zamowinie numer: " + order.getOrderNumber() + " zmieniło status na: " + order.getOrderStatus());
    }
}

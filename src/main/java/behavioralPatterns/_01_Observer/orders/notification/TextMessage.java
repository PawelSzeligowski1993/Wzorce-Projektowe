package behavioralPatterns._01_Observer.orders.notification;

import behavioralPatterns._01_Observer.orders.order.Order;

public class TextMessage implements Observer {
    public void update(Order order){
        System.out.println("Wiadomość Tekstowa = Zamowinie numer: " + order.getOrderNumber() + " zmieniło status na: " + order.getOrderStatus());
    }
}

package notification;

import order.Order;

public class Email {
    public void updateOrderStatus(Order order){
        System.out.println("Email = Zamowinie numer: " + order.getOrderNumber() + " zmieniło status na: " + order.getOrderStatus());
    }
}

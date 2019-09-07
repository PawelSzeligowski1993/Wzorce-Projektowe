package notification;

import order.Order;

public class TextMessage {
    public void updateOrderStatus(Order order){
        System.out.println("Wiadomość Tekstowa = Zamowinie numer: " + order.getOrderNumber() + " zmieniło status na: " + order.getOrderStatus());
    }
}

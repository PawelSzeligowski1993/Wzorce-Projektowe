package behavioralPatterns._01_Observer.orders;

import behavioralPatterns._01_Observer.orders.notification.Email;
import behavioralPatterns._01_Observer.orders.notification.MobileApp;
import behavioralPatterns._01_Observer.orders.notification.TextMessage;
import behavioralPatterns._01_Observer.orders.order.Order;
import behavioralPatterns._01_Observer.orders.order.OrderStatus;

public class main {
    public static void main(String[] args) {

        Order order = new Order(110L, OrderStatus.ZAREJESTROWANE);

        TextMessage textMessage = new TextMessage();
        MobileApp mobileApp = new MobileApp();
        Email email = new Email();

        order.registerObserver(textMessage);
        order.registerObserver(mobileApp);
        order.registerObserver(email);

        order.notifyObservers();

        System.out.println("-------------some-changes--------------");
        order.changeOrderStatus(OrderStatus.WYSLANE);

        order.unregisterObserver(email);

        order.changeOrderStatus(OrderStatus.ODEBRANE);
    }
}

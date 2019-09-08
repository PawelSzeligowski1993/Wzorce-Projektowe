package _01_Observer.orders.notification;

import _01_Observer.orders.order.Order;

public interface Observer {

    void update (Order order);

}

package behavioralPatterns._01_Observer.orders.notification;

import behavioralPatterns._01_Observer.orders.order.Order;

public interface Observer {

    void update (Order order);

}

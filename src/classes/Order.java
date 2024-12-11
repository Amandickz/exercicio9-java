package classes;

import entities.OrderStatus;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Order {

    Client client;
    private LocalDateTime moment;
    private OrderStatus status;

    ArrayList<OrderItem> orderItems = new ArrayList<>();

    public Order(Client client, LocalDateTime moment, OrderStatus status) {
        this.client = client;
        this.moment = moment;
        this.status = status;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public ArrayList<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(ArrayList<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Order{" +
                "client=" + client +
                ", moment=" + moment +
                ", status=" + status +
                ", orderItems=" + orderItems +
                '}';
    }

    public void addItem(OrderItem item) {
        orderItems.add(item);
        System.out.println(orderItems.toString());
    }

    public void removeItem(OrderItem item) {
        orderItems.remove(item);
    }

    public double total(){
        return 0;
    }
}

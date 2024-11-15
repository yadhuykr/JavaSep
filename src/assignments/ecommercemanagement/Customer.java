package assignments.ecommercemanagement;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User {
    String address;
    List<Order> orderHistory = new ArrayList<>();

    @Override
    public String getRole(){
        return "Customer";
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Order> getOrder() {
        return orderHistory;
    }

    public void addOrder(Order order) {
        orderHistory.add(order);
    }
}

package assignments.ecommercemanagement;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderId;
    private Customer customer;
    private List<Product> productList = new ArrayList<>();
    private double totalAmount;

    public Order(int orderId, Customer customer, List<Product> productList) {
        this.orderId = orderId;
        this.customer = customer;
        this.productList = productList;
        calculateTotalAmount();
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void calculateTotalAmount(){
        totalAmount=0;
        for(Product product:productList){
            totalAmount=totalAmount+product.getPrice();
        }
    }


}

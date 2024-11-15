package assignments.ecommercemanagement;

import com.sun.scenario.effect.impl.prism.PrDrawable;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> productList=new ArrayList<>();

    public void addProduct(Customer customer,Product product){
        productList.add(product);
        System.out.println(customer.getName()+" added "+product.getName()+" to the cart");
    }

    public void removeProduct(Product product){
        productList.remove(product);
    }

    public Order checkout(int orderId, Customer customer){
        return new Order(orderId,customer,productList);
    }


}

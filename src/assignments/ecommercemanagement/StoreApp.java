package assignments.ecommercemanagement;

import java.util.List;

public class StoreApp {
    public static void main(String[] args) {
        Store store=new Store();

        System.out.println("Welcome to the E-commerce Management System!" );
        System.out.println();
        System.out.println("Registering users... ");
        Customer customer = new Customer();
        customer.setName("John Doe");
        customer.setEmail("johndoe@gmail.com");
        customer.setPhoneNumber(020202);
        customer.setUserid(101);
        customer.setAddress("new york");
        store.registerUser(customer);

        Admin admin = new Admin();
        admin.setName("Sarah Smith");
        admin.setEmail("sarasmith@gmail.com");
        admin.setPhoneNumber(01012);
        admin.setUserid(100);
        store.registerUser(admin);
        System.out.println();

        System.out.println("Registering products...");
        Product product = new Product();
        product.setName("Laptop");
        product.setPrice(1200);
        product.setProductid(101);
        product.setStockQuantity(12);
        store.addProduct(admin,product);

        Product product1 = new Product();
        product1.setName("Smartphone");
        product1.setPrice(800);
        product1.setProductid(102);
        product1.setStockQuantity(10);
        store.addProduct(admin, product1);

        System.out.println();
        store.updateProduct(admin,101,10);


        Cart cart = new Cart();
        cart.addProduct(customer,product);
        cart.addProduct(customer,product1);
        Order order = cart.checkout(1001,customer);
        if(store.placeOrder(order.getCustomer(),order.getProductList())){
            System.out.println("Order placed successfully!! Order amount is "+order.getTotalAmount());
            store.reduceStock(admin,order.getProductList());
        }
        customer.addOrder(order);
        System.out.println();

        System.out.println("Order history for "+customer.getName());
        List<Order> orderHistory = customer.getOrder();
        for(Order placedOorder:orderHistory){
            System.out.println("Order iD : "+placedOorder.getOrderId());
            System.out.print("Products :");
            for(Product prod:placedOorder.getProductList()){
                System.out.print(prod.getName()+ "  ");
            }
            System.out.println();
            System.out.println("Total Amount: $" +placedOorder.getTotalAmount());

        }
        System.out.println();
        System.out.println("Current available Products : ");
        int counter = 1;
        for(Product resProduct:store.getProductList()){
            System.out.println(counter+". "+resProduct.getName()+ " - " + resProduct.getPrice()+ " (Stock: "+ resProduct.getStockQuantity()+")");
            counter++;
        }



    }
}

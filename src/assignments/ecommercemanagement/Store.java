package assignments.ecommercemanagement;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Store {
    private List<Product> productList = new ArrayList<>();
    private List<User>  userList = new ArrayList<>();

    public void addProduct(User user, Product product){
        if(Objects.equals(user.getRole(), "Admin")) {
            productList.add(product);
            System.out.println("Product: " + product.getName() + " with price $" + product.getPrice() + " added to the store");
        }else{
            System.out.println("Cannot add product as user is not admin");
        }
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public void removeProduct(int productId){
        for(Product product:productList){
            if(product.getProductid()==productId){
                productList.remove(product);
                System.out.println("Product deleted for productId");
            }
        }
    }

    public void updateProduct(User user, int productId, int newStock) {
        if (Objects.equals(user.getRole(), "Admin")) {
            for (Product product : productList) {
                if (product.getProductid() == productId) {
                    product.setStockQuantity(newStock);
                    System.out.println(user.getName()+" "+"("+user.getRole()+")"+" updates stock for "+product.getName()+ " to "+newStock+" units");
                }
            }
        }else{
            System.out.println("Cannot update product as user is not admin");
        }
    }

    public void registerUser(User user){
        userList.add(user);
        System.out.println("User: "+user.getName()+" registered as a "+user.getRole() );
    }

    public boolean placeOrder(Customer customer, List<Product> products){
            for(Product product:products){
                if(!product.isAvailable()){
                    System.out.println("Entered product is not available "+product.getProductid());
                    return false;
                }
            }
        return true;
    }

    public void reduceStock(Admin admin,List<Product> products){
        for(Product product:products){
            product.setStockQuantity(product.getStockQuantity()-1);
        }
    }






}

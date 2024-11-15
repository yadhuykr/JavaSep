package assignments.ecommercemanagement;

import javafx.scene.paint.Stop;

public class Product {
    private int productid;
    private String name;
    private double price;
    private int stockQuantity;

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<0){
            System.out.println("Cannot set price- Price must be non negative");
        }else{
            this.price = price;
        }
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        if(stockQuantity<0){
            System.out.println("Cannot set stock quantity- Stock quantity must be non negative");
        }else{
            this.stockQuantity = stockQuantity;
        }

    }

    public boolean isAvailable(){
        return stockQuantity != 0;
    }
}

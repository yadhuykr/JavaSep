package assignments.arrays.productinventorymanagement;

public class ProductInventory {
    String[] products=new String[5];
    int[] prices = new int[5];

    public void display(){
        System.out.println("Product : Price  ");
        for(int i=0;i<5;i++){
            System.out.println(products[i]+"  "+prices[i]);
        }
    }

    public void getPrice(String product){
        int index=-1;
        for(int i=0;i<5;i++){
            if(products[i].equalsIgnoreCase(product)){
                index=i;
            }
        }
        if(index>-1){
            System.out.println("Price is: "+prices[index]);
        }else{
            System.out.println("Sorry product not found!!");
        }
    }
}

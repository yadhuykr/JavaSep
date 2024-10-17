package assignments.arrays.salesanalysis;

public class Sales {
    String[] products=new String[7];
    int[] sales= new int[7];

    public void display(){
        System.out.println("---Product-----Sale");
        for(int i=0;i<7;i++){
            System.out.println(products[i]+"------"+sales[i]);
        }
    }

    public void search(String product){
        boolean found=false;
        int index=-1;
        for(int i=0;i<7;i++){
            if(products[i].equalsIgnoreCase(product)){
                found=true;
                index=i;
            }
        }
        if(found){
            System.out.println("Sales for product "+product+" is : "+sales[index]);
        }else{
            System.out.println("Sorry product not found");
        }
    }
}

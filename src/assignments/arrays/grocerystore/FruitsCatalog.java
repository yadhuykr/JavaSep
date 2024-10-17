package assignments.arrays.grocerystore;

public class FruitsCatalog {
    String[] fruits=new String[5];
    float[] priceperkg =new float[5];

    public void display(){
        System.out.println("----Price catalogue(per kg)----");
        for(int i=0;i<5;i++){
            System.out.println(fruits[i]+"---------$"+priceperkg[i]);
        }
    }

    public boolean ifFruitFound(String checkFruit){
        boolean found=false;
        for(String fruit:fruits){
            if (fruit.equalsIgnoreCase(checkFruit)) {
                found = true;
                break;
            }
        }
        return found;
    }

    public float priceCalculator(String fruit,float kg){
        int index=-1;
        float price=-1;
        for(int i=0;i<5;i++){
            if(fruits[i].equalsIgnoreCase(fruit)){
                index=i;
            }
        }
        if(index>-1){
            price=priceperkg[index]*kg;
        }
        return price;
    }
}

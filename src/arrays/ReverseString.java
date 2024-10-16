package arrays;

public class ReverseString {
    public static void main(String[] args) {
        String companyName="Pragra";
        char[] charArray=companyName.toCharArray();
        int start=0;
        int end=companyName.length()-1;
        char temp=' ';
        while(start<end){
            temp = charArray[start];
            charArray[start]=charArray[end];
            charArray[end]=temp;
            start++;
            end--;
        }
        String name=new String(charArray);
        System.out.println(name);

    }
}

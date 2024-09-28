package conditionals;

public class TicketPrice {
    public static void main(String[] args) {
        String day = "Sunday";

        if (day == "Wednesday") {
            System.out.println("Ticket price is $10");
        } else if (day == "Saturday") {
            System.out.println("Ticket price is $15");
        } else if (day == "Sunday") {
            System.out.println("Ticket price is $12");
        }else{
            System.out.println("Price not found");
        }
    }
}

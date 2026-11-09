public class Main {

    public static void main(String[] args) {

        Reservation reservation = new Reservation("king");

        System.out.println("Did it work:");
        System.out.println( "Does this equal 139: " + reservation.getPrice() );

    }
}
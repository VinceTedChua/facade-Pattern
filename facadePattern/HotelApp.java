package facadePattern;
import java.util.Scanner;
import facadePattern.*;

public class HotelApp {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        FrontDesk frontDesk = new FrontDesk();

        System.out.println("Welcome to Marriott Hotels!");

        boolean toExit = false;
        while (!toExit) {
            System.out.println("\nChoose Automative Functions:\n");
            System.out.println("[1]: Fetch- Vehicle");
            System.out.println("[2]: Clean- Room");
            System.out.println("[3]: Request Cart(s)/Luggage(s)");
            System.out.println("[4]: Terminate Program");

            System.out.println("\nEnter Choice: ");
            int options = sc.nextInt();

            switch (options) {
                case 1:
                    System.out.println("Enter License(Plate) Number: ");
                    sc.nextLine();
                    String plateNumber = sc.nextLine();
                    Valet valetService = new Valet((plateNumber));
                    System.out.println(frontDesk.callService((valetService)));
                    break;
                case 2:
                    System.out.println("Enter Room(RM) Number: ");
                    int roomNumber = sc.nextInt();
                    HouseKeeping houseKeepingService = new HouseKeeping((roomNumber));
                    System.out.println(frontDesk.callService((houseKeepingService)));
                    break;
                case 3:
                    System.out.println("Enter Number(#) of Carts: ");
                    int numberOfCarts = sc.nextInt();
                    Cart cartService = new Cart(numberOfCarts);
                    System.out.println(frontDesk.callService(cartService));
                    break;
                case 4:
                    toExit = true;
                    System.out.print("Program-Terminating.... -CHUA,VINCE");
                    break;
                default:
                    System.out.println("Incorrect Choice, Try again!");
                    break;

            }
        }
    }
}

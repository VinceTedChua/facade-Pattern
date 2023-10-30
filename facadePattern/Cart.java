package facadePattern;

public class Cart implements HotelService {
    private int numberOfCarts;

    public Cart(int newNumberOfCarts) {
        numberOfCarts = newNumberOfCarts;
    }

    public String requestCart(int numberOfCarts) {
        return  numberOfCarts + " cart(s) has been requested please wait patiently, Thanks! ";
    }

    public String provideService() {
        return requestCart(numberOfCarts);
    }
}


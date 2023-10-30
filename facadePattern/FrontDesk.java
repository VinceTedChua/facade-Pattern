package facadePattern;

public class FrontDesk {
    public String requestService(HotelService hotelService){
        return hotelService.provideService();
    }
}

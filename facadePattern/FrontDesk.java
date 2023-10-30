package facadePattern;

public class FrontDesk {
    public String callService(HotelService hotelService){
        return hotelService.giveService();
    }
}

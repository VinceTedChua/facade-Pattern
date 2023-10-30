package facadePattern;

public class HouseKeeping implements HotelService {
    private int roomNumber;

    public HouseKeeping(int newRoomNumber) {
        roomNumber = newRoomNumber;
    }

    public String cleanRoom(int roomNumber) {
        return "The Room " + roomNumber + " is now tidied up, Thank You!";
    }

    public String provideService() {
        return cleanRoom(roomNumber);
    }
}


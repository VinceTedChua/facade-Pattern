package facadePattern;

public class Valet implements HotelService {
    private String plateNumber;

    public Valet(String newPlateNumber) {
        plateNumber = newPlateNumber;
    }

    public String pickUpVehicle(String plateNumber) {
        return "Valet has fetched the vehicle with license Plate of: " + plateNumber + "!";
    }


    public String provideService() {
        return pickUpVehicle(plateNumber);
    }
}


import models.ParkingLot;
import service.ParkingLotService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static utility.constants.*;

public class Driver {
    public static void main(String[] args) throws IOException {

        ParkingLotService parkingLotService =new ParkingLotService();

        ParkingLot parkingLot = new ParkingLot(PARKING_LOT_ID,NO_OF_FLOORS,No_OF_SLOTS_PER_FLOOR);

        parkingLotService.createParkingLot(parkingLot);
    }

}

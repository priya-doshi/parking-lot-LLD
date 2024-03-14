package models;

import java.util.List;
import java.util.Map;

public class ParkingLot {

    private String parkingLotId;
    private Map<String, Floor> floorMap;

    private Integer numberOfFloors;
    private Integer numberOfSlotsPerFloor;


    public ParkingLot(String parkingLotId, Integer numberOfFloors, Integer numberOfSlotsPerFloor) {
        this.parkingLotId = parkingLotId;
        this.numberOfFloors = numberOfFloors;
        this.numberOfSlotsPerFloor = numberOfSlotsPerFloor;
    }

    public String getParkingLotId() {
        return parkingLotId;
    }


    public Integer getNumberOfFloors() {
        return numberOfFloors;
    }

    public Integer getNumberOfSlotsPerFloor() {
        return numberOfSlotsPerFloor;
    }

    public void setParkingLotId(String parkingLotId) {
        this.parkingLotId = parkingLotId;
    }

    public Map<String, Floor> getFloorMap() {
        return floorMap;
    }

    public void setFloorMap(Map<String, Floor> floorMap) {
        this.floorMap = floorMap;
    }

    public void setNumberOfFloors(Integer numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public void setNumberOfSlotsPerFloor(Integer numberOfSlotsPerFloor) {
        this.numberOfSlotsPerFloor = numberOfSlotsPerFloor;
    }
}

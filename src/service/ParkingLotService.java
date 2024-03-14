package service;

import enums.SlotStatus;
import enums.VehicleColor;
import enums.VehicleType;
import models.Floor;
import models.ParkingLot;
import models.Slot;
import models.Vehicle;
import repository.ParkingLotRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.StampedLock;

public class ParkingLotService {

    private ParkingLotRepository parkingLotRepository;
    private SlotAllocationFactory slotAllocationFactory;

    public ParkingLotService(){
        parkingLotRepository = new ParkingLotRepository();
        slotAllocationFactory = new SlotAllocationFactory();
    }

    public ParkingLot createParkingLot(ParkingLot parkingLot){
        Integer floors = parkingLot.getNumberOfFloors();
        Integer slotsPerFloor = parkingLot.getNumberOfSlotsPerFloor();
        Map<String, Floor> floorMap = new HashMap<>();

        for(Integer i = 1; i<=floors; i++){
            Floor floor = parkingLotRepository.createFloor(slotsPerFloor);
            floorMap.put(floor.getFloorId(), floor);
        }
        parkingLot.setFloorMap(floorMap);
        return parkingLot;
    }

    public String parkVehicle(ParkingLot parkingLot, Vehicle vehicle){
        SlotAllocationStrategy slotAllocationStrategy = slotAllocationFactory.getAllocationBy();
        Slot slot = slotAllocationStrategy.getSlot(parkingLot, vehicle);
        parkingLotRepository.updateSlotStatus(slot, SlotStatus.FILLED);

       for(Map.Entry<String, Floor> entry : parkingLot.getFloorMap().entrySet()){
           Floor floor = entry.getValue();
           Map<String, Slot> slotMap = floor.getSlotMap();
           s

       }


    }
//
//    public String parkVehicle(String registrationNumber, VehicleColor vehicleColor){
//
//    }
//
//    public Map<Integer,Integer> displaySlotsAvailablePerFloor(){
//
//    }
//
//    public Map<Integer,Integer> displaySlotsAvailablePerFloorForVehicle(VehicleType vehicleType){
//
//    }
//
//
//    public Map<Integer,Integer> displaySlotsOccupiedPerFloorForVehicle(VehicleType vehicleType){
//
//    }

}

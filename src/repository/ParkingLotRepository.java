package repository;

import enums.SlotStatus;
import enums.VehicleType;
import models.Floor;
import models.Slot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static enums.VehicleType.*;

public class ParkingLotRepository {

    public static Integer slotId = 1;
    public static Integer floorId = 1;

    public Slot createSlot(VehicleType vehicleType){
        Slot slot = new Slot("sl-" + slotId.toString(), vehicleType, SlotStatus.AVAILABLE);
        slotId++;
        return slot;
    }

    public Floor createFloor(Integer noOfSlots){
        Map<String, Slot> slotMap = new HashMap<>();

        for(Integer i=1; i<=noOfSlots; i++){
            Slot slot;
            if(i==1){
                slot = createSlot(TRUCK);
            }
            else if(i==2 || i==3){
                slot = createSlot(CAR);
            }
            else{
                slot = createSlot(BIKE);
            }
            slotMap.put(slot.getSlotId(), slot);
        }
        Floor floor = new Floor("fr-"+floorId.toString(), slotMap);
        floorId++;
        return floor;
    }

    public Slot updateSlotStatus(Slot slot, SlotStatus slotStatus){
        slot.setSlotStatus(slotStatus);
        return slot;
    }

}

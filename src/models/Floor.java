package models;

import enums.VehicleType;

import java.util.List;
import java.util.Map;

public class Floor {

    private String floorId;

    private Map<String, Slot> slotMap;

    public Floor(String floorId, Map<String, Slot> slotMap) {
        this.floorId = floorId;
        this.slotMap = slotMap;
    }

    public String getFloorId() {
        return floorId;
    }

    public void setFloorId(String floorId) {
        this.floorId = floorId;
    }

    public Map<String, Slot> getSlotMap() {
        return slotMap;
    }

    public void setSlotMap(Map<String, Slot> slotMap) {
        this.slotMap = slotMap;
    }
}

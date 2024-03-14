package models;

import enums.SlotStatus;
import enums.VehicleType;

public class Slot {
    private String slotId;
    private VehicleType vehicleType;
    private SlotStatus slotStatus;

    public Slot(String slotId, VehicleType vehicleType, SlotStatus slotStatus) {
        this.slotId = slotId;
        this.vehicleType = vehicleType;
        this.slotStatus = slotStatus;
    }

    public String getSlotId() {
        return slotId;
    }

    public void setSlotId(String slotId) {
        this.slotId = slotId;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public SlotStatus getSlotStatus() {
        return slotStatus;
    }

    public void setSlotStatus(SlotStatus slotStatus) {
        this.slotStatus = slotStatus;
    }
}

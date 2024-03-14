package service;

import models.ParkingLot;
import models.Slot;
import models.Vehicle;

public interface SlotAllocationStrategy {
    Slot getSlot(ParkingLot parkingLot, Vehicle vehicle);
}

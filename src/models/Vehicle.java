package models;

import enums.VehicleColor;
import enums.VehicleType;

public class Vehicle {
    private VehicleType vehicleType;
    private String registrationNumber;
    private VehicleColor vehicleColor;

    public Vehicle(VehicleType vehicleType, String registrationNumber, VehicleColor vehicleColor) {
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
        this.vehicleColor = vehicleColor;
    }
}

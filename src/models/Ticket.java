package models;

public class Ticket {

    private String ticketId;
    private Slot slot;
    private Vehicle vehicle;
    private Floor floor;

    public Ticket(String ticketId, Slot slot, Vehicle vehicle, Floor floor) {
        this.ticketId = ticketId;
        this.slot = slot;
        this.vehicle = vehicle;
        this.floor = floor;
    }
}

package Vehicles;

import src.ParkingTicket;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Vehicle {
    private int registrationNo;
    public vehicleType vehicleType ;
    ParkingTicket parkingTicket;

    public Vehicle(int registrationNo, Vehicles.vehicleType vehicleType) {
        this.registrationNo = registrationNo;
        this.vehicleType = vehicleType;
    }

    public Vehicles.vehicleType getVehicleType() {
        return vehicleType;
    }

    public ParkingTicket getParkingTicket() {
        return parkingTicket;
    }

    public void setParkingTicket(ParkingTicket parkingTicket) {
        this.parkingTicket = parkingTicket;
    }
}

package src;

import Parking.ParkingFloor;
import Parking.ParkingLocation;
import Parking.ParkingSpace;
import Vehicles.Vehicle;
import Vehicles.vehicleType;

import java.time.LocalDateTime;

public class ParkingTicket {
    LocalDateTime entryTime;
    int rate;  //price per hour
    ParkingLocation parkingLocation ;

    private int calculateRate(Vehicle vehicle){
        switch (vehicle.vehicleType) {
            case Bike:
                return 10;
            case Car:
                return  30;
            case MiniBus:
                return 70;
        }
        return -1;
    }
    public  ParkingTicket(Vehicle vehicle, ParkingLocation parkingLocation){
        this.entryTime = LocalDateTime.now();
        this.rate = calculateRate(vehicle);
        this.parkingLocation = parkingLocation;
    }

    public ParkingLocation getParkingLocation() {
        return parkingLocation;
    }
}

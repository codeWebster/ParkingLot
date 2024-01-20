package Parking;

import Vehicles.Vehicle;
import Vehicles.vehicleType;

public class ParkingSpace {
    int spaceNum;

    public int getSpaceNum() {
        return spaceNum;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public vehicleType getParkingType() {
        return parkingType;
    }

    Vehicle vehicle;
    vehicleType parkingType;

    public ParkingSpace(int spaceNum, vehicleType parkingType) {
        this.spaceNum = spaceNum;
        this.parkingType = parkingType;
    }
}

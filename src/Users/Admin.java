package Users;

import Parking.ParkingFloor;
import Parking.ParkingSpace;
import Vehicles.vehicleType;

import java.util.List;

public class Admin extends Account{
    static int floorNum = 1 ;
    public ParkingFloor createParkingFloor( List<ParkingSpace> parkingSpaceList){
        return new ParkingFloor(floorNum++, parkingSpaceList);
    }
    public ParkingSpace createParkingSpace(int spaceNum, vehicleType parkingType){
        return new ParkingSpace(spaceNum, parkingType);
    }
    public void addParkingSpace(ParkingFloor parkingFloor, ParkingSpace parkingSpace){
        parkingFloor.addParkingSpace(parkingSpace);
    }
}

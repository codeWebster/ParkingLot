package Users;

import Gates.ExitGate;
import Parking.ParkingFloor;
import Parking.ParkingSpace;
import Vehicles.vehicleType;

import java.util.List;

public class Admin extends Account{
    static int floorNum = 1 ;
    static int gateNum = 1;

    public Admin(String name, String employeeId) {
        super(name, employeeId);
    }

    public ParkingFloor createParkingFloor( List<ParkingSpace> parkingSpaceList){
        return new ParkingFloor(floorNum++, parkingSpaceList);
    }
    public ParkingSpace createParkingSpace(int spaceNum, vehicleType parkingType){
        return new ParkingSpace(spaceNum, parkingType);
    }
    public void addParkingSpace(ParkingFloor parkingFloor, ParkingSpace parkingSpace){
        parkingFloor.addParkingSpace(parkingSpace);
    }
    public void addExitGate(List<ExitGate> exitGates, GateAttendant gateAttendant){
        ExitGate exitGate = new ExitGate(gateNum++, gateAttendant);
    }
}

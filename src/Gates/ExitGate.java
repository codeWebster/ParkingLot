package Gates;

import Gates.Gate;
import Parking.ParkingFloor;
import Parking.ParkingLocation;
import Vehicles.Vehicle;
import payments.PaymentMode;
import src.ParkingTicket;

import java.util.ArrayList;
import java.util.List;

public class ExitGate extends Gate {

    public void exitTheVehicle(Vehicle vehicle, List<ParkingFloor> parkingFloorList){
        ParkingTicket parkingTicket = vehicle.getParkingTicket();
        ParkingLocation parkingLocation = parkingTicket.getParkingLocation();
        parkingFloorList.get(parkingLocation.floorNum).getParkingSpaceList().set(parkingLocation.spaceNum, null);
    }
}

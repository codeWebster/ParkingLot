package Gates;

import Gates.Gate;
import Parking.ParkingFloor;
import Parking.ParkingLocation;
import Parking.ParkingSpace;
import Vehicles.*;
import src.*;

import java.util.List;

public class EntryGate extends Gate {
    ParkingLocation getSpace(Vehicle vehicle, List<ParkingFloor> parkingFloorList){
        for(ParkingFloor parkingFloor: parkingFloorList) {
            for(ParkingSpace parkingSpace: parkingFloor.getParkingSpaceList()){
                if(parkingSpace.getVehicle() == null && parkingSpace.getParkingType() == vehicle.vehicleType){
                    parkingSpace.setVehicle(vehicle);
                    return new ParkingLocation(parkingFloor.getFloorNum(), parkingSpace.getSpaceNum());
                }
            }
        }
        return null;
    }
    public void issueParkingTicket(Vehicle vehicle, List<ParkingFloor> parkingFloorList){
        ParkingLocation parkingLocation = getSpace(vehicle, parkingFloorList);
        if(parkingLocation != null)
            vehicle.setParkingTicket( new ParkingTicket(vehicle,parkingLocation));
    }
}

package Gates;

import Gates.Gate;
import Parking.ParkingFloor;
import Parking.ParkingLocation;
import Users.GateAttendant;
import Vehicles.Vehicle;
import payments.PaymentMode;
import src.ParkingTicket;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ExitGate extends Gate {

    public void exitTheVehicle(Vehicle vehicle, List<ParkingFloor> parkingFloorList){
        ParkingTicket parkingTicket = vehicle.getParkingTicket();
        ParkingLocation parkingLocation = parkingTicket.getParkingLocation();
        parkingFloorList.get(parkingLocation.floorNum).getParkingSpaceList().set(parkingLocation.spaceNum, null);
        LocalDateTime exitTime = LocalDateTime.now();
        this.gateAttendant.addMoneyCollected(parkingTicket.getRate()*(exitTime.getHour()-parkingTicket.getEntryTime().getHour()));
    }

    public ExitGate(int gateNum, GateAttendant gateAttendant) {
        super(gateNum, gateAttendant);
    }
}

package Parking;

import java.util.List;

public class ParkingFloor {
    int floorNum;

    public int getFloorNum() {
        return floorNum;
    }

    public List<ParkingSpace> getParkingSpaceList() {
        return parkingSpaceList;
    }

    List<ParkingSpace> parkingSpaceList;

    public ParkingFloor(int floorNum, List<ParkingSpace> parkingSpaceList) {
        this.floorNum = floorNum;
        this.parkingSpaceList = parkingSpaceList;
    }
    public void addParkingSpace(ParkingSpace parkingSpace){
        parkingSpaceList.add(parkingSpace);
    }
}

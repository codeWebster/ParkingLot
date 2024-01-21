package Gates;

import Users.GateAttendant;

public class Gate {
    int gateNum;
    GateAttendant gateAttendant;

    public Gate(int gateNum, GateAttendant gateAttendant) {
        this.gateNum = gateNum;
        this.gateAttendant = gateAttendant;
    }
}

package Users;
import Gates.Gate;
import src.*;

public class GateAttendant extends Account {
    public int getMoneyCollected() {
        return moneyCollected;
    }


    public GateAttendant(String name, String employeeId) {
        super(name, employeeId);
        this.moneyCollected = 0;
    }

    int moneyCollected;
    public void addMoneyCollected(int money){
        moneyCollected+=money;
    }
}

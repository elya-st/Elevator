package logic;

public class Passenger {
    private int neededFloor;

    public Passenger() { }

    public Passenger(int neededFloor) {
        if (neededFloor == 0){
            this.neededFloor = neededFloor+2;
        }else{
            this.neededFloor = neededFloor;
        }
    }

    public int getNeededFloor() {
        return neededFloor;
    }


    @Override
    public String toString() {
        return " |" +
                "" + neededFloor+"|";
    }
}

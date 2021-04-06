package logic;


import java.util.LinkedList;

public class Elevator {
    private final int MAXPASSENGERS = 5;
    private int currentFloor;
    private LinkedList<Passenger> passengers = new LinkedList<>();

    public Elevator() { }

    public Elevator(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public Elevator(int currentFloor, LinkedList<Passenger> passengers) {
        this.currentFloor = currentFloor;
        this.passengers = passengers;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public LinkedList<Passenger> getPassengers() {
        return passengers;
    }

   public Passenger getPassengerByIndex(int index){
        return this.passengers.get(index);
   }

    public void passengerIn(Passenger passenger){
        this.passengers.add(passenger);
    }

    public void passengerOut(LinkedList<Passenger>passengers){
        this.passengers.removeAll(passengers);
    }


    public void liftUp(int i){
        this.currentFloor=i;
    }

    public void liftDown(int i){
        this.currentFloor-=i;
    }


    @Override
    public String toString() {
        return "ELEVATOR\n" + passengers;
    }

    public boolean isFull(){
        if(getPassengers().size()<MAXPASSENGERS){
            return false;
        }else {
            return true;
        }

    }

}

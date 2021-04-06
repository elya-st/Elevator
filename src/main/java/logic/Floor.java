package logic;

import java.util.LinkedList;

public class Floor {
    private LinkedList<Passenger> passengers = new LinkedList<>();
    private int numPassengers;
    private boolean PressedUp;
    private boolean PressedDown;

    public Floor() { }

    public Floor(LinkedList<Passenger> passengers, int numPassengers) {
        this.passengers = passengers;
        this.numPassengers = numPassengers;
    }

    public Floor(LinkedList<Passenger> passengers) {
        this.passengers = passengers;
    }

    public int getNumPassengers() {
        return numPassengers;
    }

    public int getSizeOfPassengers(){
        return this.passengers.size();
    }

    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }

    public void addPassenger(Passenger passenger){
        this.passengers.add(passenger);
    }

    public LinkedList<Passenger> getPassengers() {
        return this.passengers;
    }

    public Passenger getPassenger(int index){
        return this.passengers.get(index);
    }

    public void removeAllPassengers(LinkedList<Passenger> passengersInElevator){
        this.passengers.removeAll(passengersInElevator);
        this.numPassengers = passengers.size();
    }

    public boolean isPressedUp() { return this.PressedUp; }

    public void setPressedUp(boolean pressedUp) {
        this.PressedUp = pressedUp;
    }

    public boolean isPressedDown() {
        return this.PressedDown;
    }

    public void setPressedDown(boolean pressedDown) {
        this.PressedDown = pressedDown;
    }

    @Override
    public String toString() {
        return "\n|Floor| \t "+ passengers;
    }
}

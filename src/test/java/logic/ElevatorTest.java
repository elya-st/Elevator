package logic;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

/*class ElevatorTest {

    @Test
    void getCurrentFloor() {
        Elevator elevator = new Elevator(2);
        assertEquals(2, elevator.getCurrentFloor());
    }

    @Test
    void setCurrentFloor() {
        Elevator elevator = new Elevator();
        elevator.setCurrentFloor(6);
        assertEquals(6, elevator.getCurrentFloor());
    }

    @Test
    void getPassengers() {
        Elevator elevator = new Elevator();
        elevator.passengerIn(new Passenger(2));
        elevator.passengerIn(new Passenger(4));
        elevator.passengerIn(new Passenger(5));
        LinkedList <Passenger> list = new LinkedList<>(elevator.getPassengers());
        assertEquals(list, elevator.getPassengers());
    }

    @Test
    void getPassengerByIndex() {
        Elevator elevator = new Elevator();
        elevator.passengerIn(new Passenger(2));
        elevator.passengerIn(new Passenger(4));
        elevator.passengerIn(new Passenger(5));
        LinkedList <Passenger> list = new LinkedList<>(elevator.getPassengers());
        assertEquals(list.get(0), elevator.getPassengerByIndex(0));
    }

    @Test
    void passengerIn() {
        Elevator elevator = new Elevator();
        elevator.passengerIn(new Passenger(2));
        elevator.passengerIn(new Passenger(4));
        elevator.passengerIn(new Passenger(5));
        assertEquals(3, elevator.getPassengers().size());
    }

    @Test
    void passengerOut() {
        Elevator elevator = new Elevator();
        elevator.passengerIn(new Passenger(2));
        elevator.passengerIn(new Passenger(4));
        elevator.passengerIn(new Passenger(5));
        LinkedList <Passenger> list = new LinkedList<>(elevator.getPassengers());
        elevator.passengerOut(list);
        assertEquals(0, elevator.getPassengers().size());
    }

    @Test
    void liftUp() {
        Elevator elevator = new Elevator();
        elevator.liftUp(3);
        assertEquals(3, elevator.getCurrentFloor());
   }

    @Test
    void liftDown() {
        Elevator elevator = new Elevator();
        elevator.setCurrentFloor(7);
        elevator.liftDown(2);
        assertEquals(5, elevator.getCurrentFloor());
    }

}*/
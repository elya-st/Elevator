package logic;

import org.junit.jupiter.api.Test;


import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FloorTest {
    private LinkedList<Passenger> passengers = new LinkedList<>();
    private int numPassengers;
    private boolean PressedUp;
    private boolean PressedDown;

    @Test
    void getNumPassengers() {
        this.passengers.add(new Passenger(5));
        this.passengers.add(new Passenger(4));
        this.passengers.add(new Passenger(8));
        Floor floor = new Floor(this.passengers, this.passengers.size());
        assertEquals(3, floor.getNumPassengers());

    }

   @Test
    void addPassenger(){
        Passenger passenger = new Passenger(9);
       this.passengers.add(passenger);
       Floor floor = new Floor(this.passengers, this.passengers.size());
        assertEquals( passenger, floor.getPassenger(0));
    }

    @Test
    void setNumPassengers(){
        Floor floor = new Floor();
        floor.setNumPassengers(10);
        assertEquals(10, floor.getNumPassengers());
    }

    @Test
    void removeAllPassengers(){
        Floor floor = new Floor();
        this.passengers.add(new Passenger(13));
        this.passengers.add(new Passenger(1));
        this.passengers.add(new Passenger(12));
        this.passengers.add(new Passenger(6));
        LinkedList<Passenger> list = new LinkedList<>(this.passengers);
        floor.removeAllPassengers(list);
        assertEquals(0, floor.getNumPassengers());

    }

    @Test
    void getSizeOfPassengers() {
        LinkedList<Passenger> passengers = new LinkedList<>();
        passengers.add(new Passenger(5));
        passengers.add(new Passenger(4));
        passengers.add(new Passenger(3));
        Floor floor = new Floor(passengers);
        assertEquals(3, floor.getSizeOfPassengers());
    }

    @Test
    void getPassengers() {
        LinkedList<Passenger> passengers = new LinkedList<>();
        passengers.add(new Passenger(5));
        passengers.add(new Passenger(4));
        passengers.add(new Passenger(3));
        Floor floor = new Floor(passengers);
        assertEquals(passengers, floor.getPassengers());
    }

    @Test
    void getPassenger() {
        LinkedList<Passenger> passengers = new LinkedList<>();
        passengers.add(new Passenger(5));
        passengers.add(new Passenger(4));
        passengers.add(new Passenger(3));
        Floor floor = new Floor(passengers);
        assertEquals(passengers.get(1), floor.getPassenger(1));
    }

    @Test
    void isPressedUp(){
        Floor floor = new Floor();
        floor.setPressedUp(true);
        assertTrue(floor.isPressedUp());
        floor.setPressedUp(false);
        assertFalse(floor.isPressedUp());
    }
    @Test
    void setPressedUp(){
        Floor floor = new Floor();
        floor.setPressedUp(true);
        assertTrue(floor.isPressedUp());
        floor.setPressedUp(false);
        assertFalse(floor.isPressedUp());
    }

    @Test
    void isPressedDown(){
        Floor floor = new Floor();
        floor.setPressedDown(true);
        assertTrue(floor.isPressedDown());
        floor.setPressedDown(false);
        assertFalse(floor.isPressedDown());
    }

    @Test
    void setPressedDown(){
        Floor floor = new Floor();
        floor.setPressedDown(true);
        assertTrue(floor.isPressedDown());
        floor.setPressedDown(false);
        assertFalse(floor.isPressedDown());
    }
}

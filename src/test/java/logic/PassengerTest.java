package logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {

    @Test
    void getNeededFloor() {
        Passenger passenger = new Passenger(5);
        assertEquals(5, passenger.getNeededFloor());
    }
}
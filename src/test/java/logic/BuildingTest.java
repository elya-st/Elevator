package logic;


import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class BuildingTest {
    private LinkedList<Floor> floors = new LinkedList<>();
    private int maxFloor;

    @Test
    void addFloors(){
        Floor floor = new Floor();
        this.floors.add(floor);
        Building building = new Building();
        assertEquals(floor, building.getFloor(0));
    }

    @Test
    void getFloors() {
        Floor floor = new Floor();
        LinkedList <Floor> list = new LinkedList<>();
        list.add(floor);
        Building building = new Building(list);
        assertEquals(list, building.getFloors());
    }

    @Test
    void getFloor() {
        Floor floor = new Floor();
        LinkedList <Floor> list = new LinkedList<>();
        list.add(floor);
        Building building = new Building(list);
        assertEquals(floor, building.getFloor(0));
    }

    @Test
    void getMaxFloor() {
        Floor floor = new Floor();
        LinkedList <Floor> list = new LinkedList<>();
        list.add(floor);
        Building building = new Building(list, 10);
        assertEquals(10, building.getMaxFloor());
    }

    @Test
    void setMaxFloor(){
        Building building = new Building();
        building.setMaxFloor(15);
        assertEquals(15, building.getMaxFloor());
    }

}
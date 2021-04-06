package logic;

import java.util.LinkedList;

public class Building {
    private LinkedList<Floor> floors = new LinkedList<>();
    private int maxFloor;

    public Building() { }

    public Building(LinkedList<Floor> floors, int maxFloor) {
        this.floors = floors;
        this.maxFloor = maxFloor;
    }

    public Building(LinkedList<Floor> floors) {
        this.floors = floors;
    }

    public void addFloors(Floor floor){
        this.floors.add(floor);
    }

    public LinkedList<Floor> getFloors() {
        return floors;
    }
    public Floor getFloor(int index){
        return this.floors.get(index);
    }

    public int getMaxFloor() {
        return maxFloor;
    }

    public void setMaxFloor(int maxFloor) {
        this.maxFloor = maxFloor;
    }

    @Override
    public String toString() {
        return "BUILDING{" + floors +
                ", \nmaxFloor=" + maxFloor +
                '}';
    }
}

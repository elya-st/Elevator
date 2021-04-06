package logic;

import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static int generateFloors(int max){
        Random rand = new Random();
        int min = 5;
        return rand.nextInt((max-min)+2)+min;
    }

    public static int generatePassengers(int min, int max){
        Random rand = new Random();
        return rand.nextInt((max-min)+1)+min;
    }

    public static void set(Building building){
        building.setMaxFloor(generateFloors(20));

        for (int i=0; i<building.getMaxFloor(); i++){
            Floor floor = new Floor();
            floor.setNumPassengers(generatePassengers(0, 10));
            for(int j=0; j<floor.getNumPassengers(); j++) {
                if(i==0){
                    floor.addPassenger(new Passenger(generatePassengers(1, building.getMaxFloor())));
                }else if(i==building.getMaxFloor()){
                    floor.addPassenger(new Passenger(generatePassengers(1, building.getMaxFloor()-1)));
                }else {
                    floor.addPassenger(new Passenger(generatePassengers(1, building.getMaxFloor())));
                }
            }
            floor.setNumPassengers(floor.getSizeOfPassengers());
            building.addFloors(floor);
        }
    }

    public static void addPassengers(Building building, Elevator elevator){
        building.getFloor(elevator.getCurrentFloor()).getPassengers().forEach(passenger -> {
            if (passenger.getNeededFloor() > elevator.getCurrentFloor() && !elevator.isFull()) {
                elevator.passengerIn(passenger);
            }
        });
        building.getFloor(elevator.getCurrentFloor()).removeAllPassengers(elevator.getPassengers());
    }

    public static void removePassengerFromElevator(Elevator elevator){
        LinkedList<Passenger> passengers = new LinkedList<>();
        for(Passenger passenger : elevator.getPassengers()){
            if(passenger.getNeededFloor() == elevator.getCurrentFloor()+1){
                passengers.add(passenger);
            }
        }

        elevator.passengerOut(passengers);
    }

    public static void printElevatorState(Building building, Elevator elevator, int floor, String direction){
        System.out.println(direction+" "+"ELEVATOR "+direction);
        System.out.println(elevator.getPassengers());
        System.out.println("Elevator on "+ (floor+1)+" floor");
        System.out.println(building.toString());

    }


    public static void move(Building building, Elevator elevator){
        for (int i = 0; i < building.getMaxFloor(); i++) {
            elevator.liftUp(i);
            removePassengerFromElevator(elevator);
            addPassengers(building, elevator );
            removePassengerFromElevator(elevator);
            addPassengers(building, elevator);
            printElevatorState(building, elevator, i, "^");
        }
    }

    public static void main(String[] args) {
        Building building = new Building();
        Elevator elevator = new Elevator();
        set(building);
        System.out.println(building.toString());
        move(building, elevator);
    }
}

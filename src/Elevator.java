import java.util.Scanner;

public class Elevator {
    private int currentFloor;
    private int minFloor;
    private int maxFloor;
    private int nextFloor;
    private int floor = 1;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = floor;
    }

    public void moveDown() {
        currentFloor -= 1;
    }

    public void moveUp() {
        currentFloor += 1;
    }
    public int getNextFloor(int nextFloor) {
        this.nextFloor = nextFloor;
        return nextFloor;
    }

    public void move(int floor) {
        while (currentFloor != floor) {
            if (floor > maxFloor || floor <minFloor) {
                System.out.println("Такого этажа не существует!" + "\n" + "Введите значение этажа от -3 до 26");
                return;
            } else if (floor < currentFloor) {
                moveDown();
                System.out.println("Этаж: " + getCurrentFloor());
            } else if (floor > currentFloor) {
                moveUp();
                System.out.println("Этаж: " + getCurrentFloor());
            } else {
                System.out.println("Вы уже на нужном этаже!");
            }
        }

        if (currentFloor >= minFloor && currentFloor <= maxFloor) {
            currentFloor = nextFloor;
        }
    }
}
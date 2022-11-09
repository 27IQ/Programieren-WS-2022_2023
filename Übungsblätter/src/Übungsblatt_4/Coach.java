package Übungsblatt_4;

public class Coach {
    private Coach next = null;
    private int passengers = 0;

    public Coach(int passengers) {
        this.passengers = passengers;
    }

    public void setNext(Coach next) {
        this.next = next;
    }

    public Coach getNext() {
        return this.next;
    }

    public int getNumberOfPassengers() {
        return this.passengers;
    }
}
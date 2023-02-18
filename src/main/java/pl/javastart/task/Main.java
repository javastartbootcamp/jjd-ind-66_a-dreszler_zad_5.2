package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Room room1 = new Room(5, 21.5, 20, true);
        System.out.println(room1.getRoomInfo());
        System.out.println(room1.lowerTemperature());
        System.out.println(room1.getRoomInfo());
        System.out.println(room1.lowerTemperature());
        System.out.println(room1.getRoomInfo());
    }
}

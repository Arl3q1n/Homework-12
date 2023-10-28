import exercises.classes.*;
import exercises.interfaces.Training;

public class Main {
    public static void main(String[] args) {

        // Exercise 1
        System.out.println("\n---------------------------\n");

        Programmer programmer = new Programmer("Andrei", "Java Middle", 20, 2);
        Manager manager = new Manager("Jan", "Java Senior", 25, 5);

        System.out.println("Programmer name - " + programmer.getName());
        System.out.println("Programmer age  - " + programmer.getAge());
        System.out.println("Description     - " + programmer.getDescription());
        System.out.println("Work experience - " + programmer.getWorkXP() + " years");
        programmer.attendTraining();

        System.out.println();

        System.out.println("Programmer name - " + manager.getName());
        System.out.println("Programmer age  - " + manager.getAge());
        System.out.println("Description     - " + manager.getDescription());
        System.out.println("Work experience - " + manager.getWorkXP() + " years");
        manager.conductInterview();

        // Exercise 2
        System.out.println("\n---------------------------\n");

        Training[] objects = {programmer, manager};
        MeetingRoom meetingRoom = new MeetingRoom(objects);
        meetingRoom.conductMeeting();

        // Exercise 3
        System.out.println("\n---------------------------\n");
    }
}
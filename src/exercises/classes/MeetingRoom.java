package exercises.classes;

import exercises.interfaces.Training;

public class MeetingRoom {

    Training[] objects;

    public MeetingRoom(Training[] object) {
        this.objects = object;
    }

    public void conductMeeting() {
        for (Training object : objects) {
            object.attendTraining();
        }
    }



}

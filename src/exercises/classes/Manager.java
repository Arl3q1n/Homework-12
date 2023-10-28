package exercises.classes;

import exercises.interfaces.Interview;
import exercises.interfaces.Training;

public class Manager extends Employee implements Training, Interview {

    public Manager(String name, String description, int age, int workXP) {
        super(name, description, age, workXP);
    }

    // Setters

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setDescription(String description) {
        super.setDescription(description);
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public void setWorkXP(int workXP) {
        super.setWorkXP(workXP);
    }

    // Setters

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public int getWorkXP() {
        return super.getWorkXP();
    }

    // Training & Interview

    @Override
    public void attendTraining() {
        System.out.println(name + " attend training");
    }

    @Override
    public void conductInterview() {
        System.out.println(name + " conduct interview");
    }
}
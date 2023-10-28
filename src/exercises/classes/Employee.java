package exercises.classes;

import exercises.interfaces.Training;

public class Employee {

    protected String name;
    protected String description;

    protected int  age;
    protected int workXP;

    public Employee(String name, String description, int age, int workXP) {
        setName(name);
        setDescription(description);
        setAge(age);
        setWorkXP(workXP);
    }

    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWorkXP(int workXP) {
        this.workXP = workXP;
    }

    // Getters

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getAge() {
        return age;
    }

    public int getWorkXP() {
        return workXP;
    }
}